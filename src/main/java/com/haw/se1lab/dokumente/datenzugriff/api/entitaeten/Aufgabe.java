package com.haw.se1lab.dokumente.datenzugriff.api.entitaeten;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Aufgabe {
    @Id
    @GeneratedValue
    private Long id;

    private String themenbereich;

    private String aufgabenstellung;

    private int erreichbarePunkte;

    private int erreichtePunkte;

    private String notiz;


    public Aufgabe(String themenbereich, String aufgabenstellung, int erreichbarePunkte) {
        this.themenbereich = themenbereich;
        this.aufgabenstellung = aufgabenstellung;
        this.erreichbarePunkte = erreichbarePunkte;
        this.notiz = null;
        this.erreichtePunkte = -1;
    }

    public Aufgabe() {
    }


    public String getThemenbereich() {
        return themenbereich;
    }

    public void setThemenbereich(String themenbereich) {
        this.themenbereich = themenbereich;
    }

    public String getAufgabenstellung() {
        return aufgabenstellung;
    }

    public void setAufgabenstellung(String aufgabenstellung) {
        this.aufgabenstellung = aufgabenstellung;
    }

    public int getErreichbarePunkte() {
        return erreichbarePunkte;
    }

    public void setErreichbarePunkte(int erreichbarePunkte) {
        this.erreichbarePunkte = erreichbarePunkte;
    }

    public String getNotiz() {
        return notiz;
    }

    public void setNotiz(String notiz) {
        this.notiz = notiz;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
