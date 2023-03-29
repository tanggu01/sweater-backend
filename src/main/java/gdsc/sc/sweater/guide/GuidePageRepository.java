package gdsc.sc.sweater.guide;

import gdsc.sc.sweater.entity.GuidePage;
import gdsc.sc.sweater.guide.dto.GuidePageListDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuidePageRepository extends JpaRepository<GuidePage, Long> {


}
