package com.haw.se1lab.dokumente.datenzugriff.api.entitaeten;


import com.haw.se1lab.dokumente.datentyp.NoteTyp;
import com.haw.se1lab.dokumente.datenzugriff.api.entitaeten.Aufgabenblatt;
import com.haw.se1lab.kursverwaltung.datenzugriff.api.entitaeten.Kurs;
import com.haw.se1lab.nutzer.datenzugriff.api.entitaeten.Lehrer;
import com.haw.se1lab.nutzer.datenzugriff.api.entitaeten.Schueler;

import javax.persistence.*;

@Entity
public class Test extends Aufgabenblatt {


 // Bei Enum keine Annotation notwendig
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
