package com.haw.se1lab.datenzugriff.api.repo;

import com.haw.se1lab.datenzugriff.api.entitaeten.Schueler;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchuelerRepo extends JpaRepository<Schueler, Long> {
}
