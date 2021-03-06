package allg.haw.se1lab.dokumente.datenzugriff.api.entitaeten;


import allg.haw.se1lab.dokumente.allgemein.api.datentyp.NoteTyp;
import allg.haw.se1lab.kursverwaltung.datenzugriff.api.entitaeten.Kurs;
import allg.haw.se1lab.nutzer.datenzugriff.api.entitaeten.Lehrer;
import allg.haw.se1lab.nutzer.datenzugriff.api.entitaeten.Schueler;

import javax.persistence.*;

@Entity
public class Test extends Aufgabenblatt {


 @Enumerated(EnumType.STRING)
    private NoteTyp note;


    public Test(String name, String themenbereich, Kurs kurs, Lehrer ersteller, Schueler bearbeiter){
        super(name, themenbereich,kurs,ersteller, bearbeiter);
        this.note = null; // Test erstmal nicht benotet!

    }

    public Test() {
    }

    public NoteTyp getNote() {
        return note;
    }

    public void setNote(NoteTyp note) {
        this.note = note;
    }

    /*public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }*/
}
