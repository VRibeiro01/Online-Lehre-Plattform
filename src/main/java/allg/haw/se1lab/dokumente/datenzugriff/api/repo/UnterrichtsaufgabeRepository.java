package allg.haw.se1lab.dokumente.datenzugriff.api.repo;

import allg.haw.se1lab.dokumente.datenzugriff.api.entitaeten.Unterrichtsaufgabe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnterrichtsaufgabeRepository extends JpaRepository<Unterrichtsaufgabe, Long> {
}
