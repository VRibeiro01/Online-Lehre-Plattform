package com.haw.se1lab.kursverwaltung.datenzugriff.api.repo;


import com.haw.se1lab.kursverwaltung.datenzugriff.api.entitaeten.Kurs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface kursRepo extends JpaRepository<Kurs, Long> {
}