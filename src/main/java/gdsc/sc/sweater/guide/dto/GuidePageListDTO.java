package gdsc.sc.sweater.guide.dto;

import gdsc.sc.sweater.entity.GuidePage;
import lombok.Getter;

@Getter
public class GuidePageListDTO {

    private Long guidePageId;
    private String subtitle;
    private String content;

    public GuidePageListDTO(GuidePage guidePage) {
        this.guidePageId = guidePage.getId();
        this.subtitle = guidePage.getSubtitle();
        this.content = guidePage.getContent();
    }
}
