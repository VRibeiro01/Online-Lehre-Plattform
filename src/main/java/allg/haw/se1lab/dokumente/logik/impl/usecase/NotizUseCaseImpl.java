package allg.haw.se1lab.dokumente.logik.impl.usecase;

import allg.haw.se1lab.dokumente.logik.api.usecase.NotizUseCase;
import allg.haw.se1lab.dokumente.datenzugriff.api.entitaeten.Aufgabe;
import allg.haw.se1lab.dokumente.datenzugriff.api.repo.AufgabeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@Transactional
public class NotizUseCaseImpl implements NotizUseCase {

    @Autowired
    private AufgabeRepository aufgabeRepo;

    @Override
    public void notizHinzufuegen(Aufgabe aufgabe, String notiz) {

        // Aufgabe aus der Datenbank holen, die verändert werden soll
        Aufgabe aufgabeDB = aufgabeRepo.getOne(aufgabe.getId());
       aufgabeDB.setNotiz(notiz);
       aufgabeRepo.save(aufgabeDB);



    }


        
}
