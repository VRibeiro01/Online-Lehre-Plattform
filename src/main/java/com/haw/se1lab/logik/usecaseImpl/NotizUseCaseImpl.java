package com.haw.se1lab.logik.usecaseImpl;

import com.haw.se1lab.datenzugriff.api.entitaeten.Aufgabe;
import com.haw.se1lab.datenzugriff.api.repo.AufgabeRepo;
import com.haw.se1lab.logik.usecase.NotizUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class NotizUseCaseImpl implements NotizUseCase {

    @Autowired
    private AufgabeRepo aufgabeRepo;

    @Override
    public void notizHinzufuegen(Aufgabe aufgabe, String notiz) {

        // Aufgabe aus der Datenbank holen, die verändert werden soll
        Optional<Aufgabe> aufgabeDB = aufgabeRepo.findById(aufgabe.getId());


       aufgabeDB.ifPresent( aufg -> {

           //Notiz in der Aufgabe eintragen
           aufg.setNotiz(notiz);

           //Eintrag der Aufgabe in der Datenbank aktualisieren
            aufgabeRepo.save(aufg);

       });

    }

        
}
