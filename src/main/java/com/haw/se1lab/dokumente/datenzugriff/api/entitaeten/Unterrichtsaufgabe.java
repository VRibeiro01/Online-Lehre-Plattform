package com.haw.se1lab.dokumente.datenzugriff.api.entitaeten;

import com.haw.se1lab.dokumente.datenzugriff.api.entitaeten.Aufgabenblatt;
import com.haw.se1lab.kursverwaltung.datenzugriff.api.entitaeten.Kurs;
import com.haw.se1lab.nutzer.datenzugriff.api.entitaeten.Lehrer;
import com.haw.se1lab.nutzer.datenzugriff.api.entitaeten.Schueler;

import javax.persistence.Entity;

@Entity
public class Unterrichtsaufgabe extends Aufgabenblatt {

  /*  @Id
    @GeneratedValue
    private Long id;*/

    public Unterrichtsaufgabe(String name, String themenbereich, Kurs kurs, Lehrer ersteller, Schueler bearbeiter){
        super(name,themenbereich,kurs, ersteller, bearbeiter);
    }


    public Unterrichtsaufgabe() {
    }

    /*public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }*/
}
