package logik.useCase;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.haw.se1lab.Application;
import com.haw.se1lab.dokumente.datenzugriff.api.entitaeten.Aufgabe;
import com.haw.se1lab.dokumente.datenzugriff.api.repo.AufgabeRepo;
import com.haw.se1lab.dokumente.logik.useCase.NotizUseCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@Transactional
public class NotizUseCaseTest {

    @Autowired // automatically initializes the field with a Spring bean of a matching type
    private NotizUseCase notizUseCase;

    @Autowired // automatically initializes the field with a Spring bean of a matching type
    private AufgabeRepo aufgabeRepo;
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
    //d

    @Test // marks this method as a test case
    public void notizHinzufuegen() {
     String notiz = "Du hast Jambus mit Trochäus verwechselt";

     notizUseCase.notizHinzufuegen(aufgabe,notiz);
        Long result_id = aufgabeRepo.findAll().get(0).getId();
        Long expected_id = aufgabe.getId();
        String result_notiz = aufgabeRepo.findAll().get(0).getNotiz();
        long entitaetenAnzahl = aufgabeRepo.count();

        //Prüfen ob Tupelanzahl in der Tabelle stimmt, denn Tupel soll geupdated werden und nicht nochmal eingefügt werden
        assertThat(entitaetenAnzahl).isEqualTo(1);

        // Prüfen ob id der Aufgabe in der Tabelle die gleiche Id wie die übergebene Aufgabe hat
        assertEquals(expected_id,result_id,0.01);

        // Prüfen, ob Notiz tatsächlich eingefügt wurde
        assertEquals(notiz,result_notiz);
    }

}

