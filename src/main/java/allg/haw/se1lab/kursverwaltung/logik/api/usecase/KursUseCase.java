package allg.haw.se1lab.kursverwaltung.logik.api.usecase;

import allg.haw.se1lab.kursverwaltung.datenzugriff.api.entitaeten.Kurs;
import allg.haw.se1lab.nutzer.datenzugriff.api.entitaeten.Lehrer;

import java.util.List;

public interface KursUseCase {

    /** Lädt den Kurs, dem die angegebene Kus-Id gehört
     *
     *
     * @param kurs_id, darf nicht <code>null</code> sein
     * @return Kurs : der gesuchte Kurs wird zurückgegeben, oder <code>null</code>, wenn Kurs nicht gefunden wird
     */
    Kurs ladeKurs(Long kurs_id);


    /**
     * Liefert eine Liste der Kurse, die der angegebene Lehrer verwaltet. Lehrer muss bereits in der Datenbank eingetragen sein
     * @param verwalter
     * @return Liste der Kurse. Liefert <code>null</code>, wenn Lehrer noch nicht in der DAtenbank eingetragen ist
     */
    List<Kurs> ladeKurse(Lehrer verwalter);
}
