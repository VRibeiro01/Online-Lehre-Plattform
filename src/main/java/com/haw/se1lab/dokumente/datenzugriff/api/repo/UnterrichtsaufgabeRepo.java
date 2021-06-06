package com.haw.se1lab.dokumente.datenzugriff.api.repo;

import com.haw.se1lab.dokumente.datenzugriff.api.entitaeten.Unterrichtsaufgabe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnterrichtsaufgabeRepo extends JpaRepository<Unterrichtsaufgabe, Long> {
}
