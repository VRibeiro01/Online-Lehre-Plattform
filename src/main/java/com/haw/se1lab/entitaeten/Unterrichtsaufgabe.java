package com.haw.se1lab.entitaeten;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
