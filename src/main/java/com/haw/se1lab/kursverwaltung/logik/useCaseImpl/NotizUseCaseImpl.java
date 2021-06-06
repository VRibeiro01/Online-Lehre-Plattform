package com.haw.se1lab.kursverwaltung.logik.useCaseImpl;

import com.haw.se1lab.dokumente.datenzugriff.api.entitaeten.Aufgabe;
import com.haw.se1lab.dokumente.datenzugriff.api.repo.AufgabeRepo;
import com.haw.se1lab.dokumente.logik.useCase.NotizUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotizUseCaseImpl implements NotizUseCase {

    @Autowired
    private AufgabeRepo aufgabeRepo;

    @Override
    public Aufgabe notizHinzufuegen(Aufgabe aufgabe, String notiz) {

        // Aufgabe aus der Datenbank holen, die verändert werden soll
        Aufgabe aufgabeDB = aufgabeRepo.getOne(aufgabe.getId());
       aufgabeDB.setNotiz(notiz);
       aufgabeRepo.save(aufgabeDB);

       return aufgabeDB;

    }


        
}
