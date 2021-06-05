package com.haw.se1lab.entitaeten;


import com.haw.se1lab.datentypen.NoteTyp;
import com.haw.se1lab.entitaeten.Aufgabenblatt;
import com.haw.se1lab.entitaeten.Kurs;
import com.haw.se1lab.entitaeten.Lehrer;
import com.haw.se1lab.entitaeten.Schueler;

import javax.persistence.*;

@Entity
public class Test extends Aufgabenblatt {

    @Id
    @GeneratedValue
    private Long id;

 // Bei Enum keine Annotation notwendig?
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
