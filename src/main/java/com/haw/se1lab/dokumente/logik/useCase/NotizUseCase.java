package com.haw.se1lab.dokumente.logik.useCase;

import com.haw.se1lab.dokumente.datenzugriff.api.entitaeten.Aufgabe;

public interface NotizUseCase {

    /**
     *Fügt eine Notiz einer Aufgabe hinzu und lädt die geänderte Aufgabe in die Datenbank
     *
     * @param aufgabe: Die Aufgabe, der eine Notiz hinzugefügt werden soll,
     *               darf nicht <code>null</code> sein,
     *               die Aufgabe muss bereits in der Datenbank vorhanden sein
     *
     * @param notiz : Die Zeichenkette, die als Notiz dient,
     *                darf <code>null</code> sein, in dem Fall werden bereits vorhandene Notizen gelöscht
     *
     *
     * @return void : Methode ändert ein Objekt, hat kein Rückgabewert
     */

    Aufgabe notizHinzufuegen(Aufgabe aufgabe,String notiz);
}
