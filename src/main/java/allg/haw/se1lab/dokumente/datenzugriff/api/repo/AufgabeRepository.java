package allg.haw.se1lab.dokumente.datenzugriff.api.repo;

import allg.haw.se1lab.dokumente.datenzugriff.api.entitaeten.Aufgabe;
import org.springframework.data.jpa.repository.JpaRepository;



public interface AufgabeRepository extends JpaRepository<Aufgabe, Long> {
}
