package com.haw.se1lab.dokumente.logik.api.usecase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.haw.se1lab.Application;
import com.haw.se1lab.dokumente.datenzugriff.api.entitaeten.Aufgabe;
import com.haw.se1lab.dokumente.datenzugriff.api.repo.AufgabeRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;



@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.NONE)
@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")

public class NotizUseCaseTest {

    @Autowired // automatically initializes the field with a Spring bean of a matching type
    private NotizUseCase notizUseCase;

    @Autowired // automatically initializes the field with a Spring bean of a matching type
    private AufgabeRepository aufgabeRepo;

    private Aufgabe aufgabe;

    @BeforeEach
     void setup(){
        aufgabe = new Aufgabe("Lyrik","Was ist ein Jambus?",3);
        aufgabeRepo.save(aufgabe);
    }

    @AfterEach // causes this method to be executed after each test method execution
    public void tearDown() {
        // clean up test data after each test method execution

        aufgabeRepo.deleteAll();
    }

//
    @Test // marks this method as a test case
    public void notizHinzufuegen() {
     String notiz = "Du hast Jambus mit Trochäus verwechselt";
     notizUseCase.notizHinzufuegen(aufgabe,notiz);
     String result_notiz = aufgabeRepo.findAll().get(0).getNotiz();

        // Prüfen, ob Notiz tatsächlich eingefügt wurde
        assertEquals(notiz,result_notiz);
    }

}

