package com.haw.se1lab.nutzer.datenzugriff.api.repo;


import com.haw.se1lab.nutzer.datenzugriff.api.entitaeten.Lehrer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LehrerRepo extends JpaRepository<Lehrer, Long> {
}
