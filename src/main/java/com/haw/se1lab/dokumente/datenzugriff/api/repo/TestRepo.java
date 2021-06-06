package com.haw.se1lab.dokumente.datenzugriff.api.repo;

import com.haw.se1lab.dokumente.datenzugriff.api.entitaeten.Test;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepo extends JpaRepository<Test, Long> {
}
