package allg.haw.se1lab.dokumente.logik.api.usecase;


import allg.haw.se1lab.dokumente.datenzugriff.api.entitaeten.Test;
import allg.haw.se1lab.kursverwaltung.datenzugriff.api.entitaeten.Kurs;
import allg.haw.se1lab.nutzer.datenzugriff.api.entitaeten.Lehrer;

import java.util.List;

public interface TestUseCase {

    /**
     * Lädt alle Tests eines Kurses, die von einem Lehrer verwaltet werden
     *, die in der Datenbank gespeichert sind
     *
     * @param kurs: Der Kurs, dessen Tests geladen werden, darf nicht <code>null</code> sein
     * @param verwalter: der Verwalter der Tests, die geladen werden
     *
     * @return: Liste der geladenen Tests
     *
     */

    List<Test> ladeTests(Kurs kurs, Lehrer verwalter);



    /**
     * Lädt einen gesuchten Test mit der angegebenen Id
     *
     *
     * @param test_id : id des gesuchten Tests
     *
     * @return Test: gesuchter Test wird zurückgegeben.  Lifert <code>null</code>, wenn Test nicht gefunden wird
     */

    Test ladeTest(Long test_id);
}
