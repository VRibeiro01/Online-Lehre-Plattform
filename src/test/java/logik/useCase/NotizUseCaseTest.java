package logik.useCase;

import static org.assertj.core.api.Assertions.assertThat;

import com.haw.se1lab.Application;
import com.haw.se1lab.datenzugriff.api.entitaeten.Aufgabe;
import com.haw.se1lab.datenzugriff.api.repo.AufgabeRepo;
import com.haw.se1lab.logik.usecase.NotizUseCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;



@SpringBootTest(classes = Application.class) // test environment
@ExtendWith(SpringExtension.class) // required to use Spring TestContext Framework in JUnit 5
public class NotizUseCaseTest {

    @Autowired // automatically initializes the field with a Spring bean of a matching type
    private NotizUseCase notizUseCase;

    @Autowired // automatically initializes the field with a Spring bean of a matching type
    private AufgabeRepo aufgabeRepo;


    private Aufgabe aufgabe;


    public void initialize(){
        aufgabe = new Aufgabe("Lyrik","Was ist ein Jambus?",3);
        aufgabeRepo.save(aufgabe);
    }

    @AfterEach // causes this method to be executed after each test method execution
    public void tearDown() {
        // clean up test data after each test method execution

        aufgabeRepo.deleteAll();
    }

    @Test // marks this method as a test case
    public void notizHinzufuegen() {
     String notiz = "Du hast Jambus mit Trochäus verwechselt";

     notizUseCase.notizHinzufuegen(aufgabe,notiz);

        long entitaetenAnzahl = aufgabeRepo.count();
        assertThat(entitaetenAnzahl).isEqualTo(1);


    }

}

