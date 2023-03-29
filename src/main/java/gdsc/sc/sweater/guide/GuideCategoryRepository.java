package gdsc.sc.sweater.guide;

import gdsc.sc.sweater.entity.GuideCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GuideCategoryRepository extends JpaRepository<GuideCategory, Integer> {

}
