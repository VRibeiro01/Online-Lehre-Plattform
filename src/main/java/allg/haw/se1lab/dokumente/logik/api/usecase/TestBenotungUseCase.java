package allg.haw.se1lab.dokumente.logik.api.usecase;

import allg.haw.se1lab.dokumente.allgemein.api.datentyp.NoteTyp;
import allg.haw.se1lab.dokumente.datenzugriff.api.entitaeten.Test;

public interface TestBenotungUseCase {

    /**
     * berechnet die Note eines Test anhand des Verhältnisses der Summe der
     * erreichten Punktzahl und der Summe der erreichbaren Punkte der Aufgaben
     * Änderung wird in die Datenbank geladen
     *
     * @param test: der zu benotende Test, darf nicht <code>null</code> sein, Test muss bereits in der Datenbank vorhanden sein
     * @return NoteTyp : Die berechnete Note wird zurückgegeben
     */

    NoteTyp TestBenoten(Test test);
}
