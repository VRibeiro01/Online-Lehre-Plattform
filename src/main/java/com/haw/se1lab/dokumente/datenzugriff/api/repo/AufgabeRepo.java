package com.haw.se1lab.dokumente.datenzugriff.api.repo;

import com.haw.se1lab.dokumente.datenzugriff.api.entitaeten.Aufgabe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AufgabeRepo extends JpaRepository<Aufgabe, Long> {
}
