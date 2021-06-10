package allg.haw.se1lab.kursverwaltung.datenzugriff.api.repo;


import allg.haw.se1lab.kursverwaltung.datenzugriff.api.entitaeten.Kurs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KursRepository extends JpaRepository<Kurs, Long> {
}
