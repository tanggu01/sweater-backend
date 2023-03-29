package gdsc.sc.sweater.guide;

import gdsc.sc.sweater.guide.dto.GuideListResponse;
import gdsc.sc.sweater.guide.dto.GuidePageResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/guide")
public class GuideController {

    private final GuideService guideService;

    /**
     * 홈화면 가이드
     */
    @GetMapping("/home")
    public ResponseEntity<List<GuideListResponse>> getHomeGuideList(@RequestParam int categoryId) {
        List<GuideListResponse> guideListResponse = guideService.getHomeGuideList(categoryId);
        return new ResponseEntity<>(guideListResponse, HttpStatus.OK);
    }


    /**
     * 가이드 페이지
     */
    @GetMapping()
    public ResponseEntity<List<GuideListResponse>> getGuideList(@RequestParam int categoryId) {
        List<GuideListResponse> guideListResponse = guideService.getGuideList(categoryId);
        return new ResponseEntity<>(guideListResponse, HttpStatus.OK);
    }


    /**
     * 가이드 상세
     */
    @GetMapping("/page")
    public ResponseEntity<GuidePageResponse> getGuideList(@RequestParam Long guideId) {
        GuidePageResponse guidePageResponse = guideService.getGuide(guideId);
        return new ResponseEntity<>(guidePageResponse, HttpStatus.OK);
    }
}
