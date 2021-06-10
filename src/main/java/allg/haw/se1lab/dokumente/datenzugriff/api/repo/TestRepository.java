package allg.haw.se1lab.dokumente.datenzugriff.api.repo;

import allg.haw.se1lab.dokumente.datenzugriff.api.entitaeten.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Test, Long> {
}
