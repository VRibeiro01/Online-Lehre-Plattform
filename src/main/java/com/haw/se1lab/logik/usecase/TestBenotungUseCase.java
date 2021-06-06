package com.haw.se1lab.logik.usecase;

import com.haw.se1lab.datentypen.NoteTyp;
import com.haw.se1lab.datenzugriff.api.entitaeten.Test;

public interface TestBenotungUseCase {

    /**
     * berechnet die Note eines Test anhand des Verhältnisses der Summe der
     * erreichten Punktzahl und der Summe der erreichbaren Punkte der Aufgaben
     * @param test: der zu benotenden Test
     * @return NoteTyp : Die berechnete Note wird zurückgegeben
     */

    NoteTyp TestBenoten(Test test);
}
