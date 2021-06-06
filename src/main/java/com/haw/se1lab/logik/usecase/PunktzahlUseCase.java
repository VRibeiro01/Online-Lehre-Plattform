package com.haw.se1lab.logik.usecase;

import com.haw.se1lab.datenzugriff.api.entitaeten.Aufgabe;

public interface PunktzahlUseCase {

/**
 * Vergibt einer Aufgabe eine Punktzahl
 *
 * @param aufgabe: die Aufgabe, der eine Punktzahl vergeben wird,
 *                  darf nicht <code>null</code> sein,
 *                  Aufgabe bereits in der Datenbank vorhanden sein
 *
 * @param punktzahl: die zu vergebende Punktzahl, darf nicht <code>null</code>
 *
 * @return void: verändert ein Objekt, hat kein Rückgabewert
 *
 * @throws IllegalArgumentException, wenn vergebene Punktzahl ungültig ist
 *
 * siehe Methode istPunktZahlGueltig
 */

  void punkteVergeben(Aufgabe aufgabe, int punktzahl);


    /**
     * Prüft ob die zu vergebene Punktzahl gültig ist
     * Eine Punktzahl ist gültig, wenn sie zwischen 0 und die erreichbarePunkte der Aufgabe liegt
     *
     * @param aufgabe: die Aufgabe, aus der die erreichbarenPunkte ermiitelt wird,
     *                 darf nicht <code>null</code> sein
     *
     * @punktZahl: die zu prüfende Punktzahl, darf nicht <code>null</code>
     *
     * @return: true, wenn die Punktzahl gueltig ist, false wenn nicht
     */

    boolean istPunktZahlGueltig(Aufgabe aufgabe, int punktZahl);


}
