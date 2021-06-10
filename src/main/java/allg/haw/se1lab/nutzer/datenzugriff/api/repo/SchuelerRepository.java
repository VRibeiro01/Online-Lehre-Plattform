package allg.haw.se1lab.nutzer.datenzugriff.api.repo;


import allg.haw.se1lab.nutzer.datenzugriff.api.entitaeten.Schueler;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchuelerRepository extends JpaRepository<Schueler, Long> {
}
