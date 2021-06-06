package com.haw.se1lab.aufgabe;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.haw.se1lab.Application;
import com.haw.se1lab.datenzugriff.api.entitaeten.Aufgabe;
import com.haw.se1lab.datenzugriff.api.repo.AufgabeRepo;
import org.assertj.core.api.Assert;
import org.hamcrest.collection.IsIterableContainingInOrder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;


@SpringBootTest(classes = Application.class) // test environment
@ExtendWith(SpringExtension.class) // required to use Spring TestContext Framework in JUnit 5
public class AufgabeRepoTest {

    @Autowired // automatically initializes the field with a Spring bean of a matching type
    private AufgabeRepo aufgabeRepo;
    private Aufgabe aufgabe;

    @BeforeEach // causes this method to be executed before each test method execution
    public void setUp() {
        // set up fresh test data before each test method execution

        aufgabe = new Aufgabe("Analysis","Führe eine Kurvendiskussion für f(x) = 2x^4 + 5x^3^durch",10);
        aufgabeRepo.save(aufgabe);
    }

    @AfterEach // causes this method to be executed after each test method execution
    public void tearDown() {
        // clean up test data after each test method execution

       aufgabeRepo.deleteAll();
    }

    @Test
    public void find_test(){
        Long id = aufgabe.getId();
        List<Aufgabe> resultList = aufgabeRepo.findAll();
        assertEquals(1,resultList.size());
        assertEquals(id, resultList.get(0).getId());
    }


    // No custom methods to test (methods inherited from JpaRepository don't need to be tested)

}