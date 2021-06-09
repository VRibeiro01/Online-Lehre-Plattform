package com.haw.se1lab.kursverwaltung.datenzugriff.api.entitaeten;

import com.haw.se1lab.datentyp.DateiTyp;
import com.haw.se1lab.nutzer.datenzugriff.api.entitaeten.Lehrer;
import com.haw.se1lab.nutzer.datenzugriff.api.entitaeten.Schueler;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Kurs {
    @Id
    @GeneratedValue
    private Long id;


    private String name;


    @ManyToMany
    private List<Schueler> teilnehmer;

    @ManyToOne
    private Lehrer verwalter;


    private int statistiken;

  @ElementCollection// spezifiziert eine Collection von Embeddable Typen
    private List<DateiTyp> dateien;


    public Kurs(String name, Lehrer verwalter, int statistiken, List<DateiTyp> dateien) {
        this.name = name;
        this.teilnehmer = new ArrayList<>();
        this.verwalter = verwalter;
        this.statistiken = statistiken;
        this.dateien = new ArrayList<>();
    }

    public Kurs() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Schueler> getTeilnehmer() {
        return teilnehmer;
    }

    public void setTeilnehmer(List<Schueler> teilnehmer) {
        this.teilnehmer = teilnehmer;
    }

    public Lehrer getVerwalter() {
        return verwalter;
    }

    public void setVerwalter(Lehrer verwalter) {
        verwalter = verwalter;
    }

    public int getStatistiken() {
        return statistiken;
    }

    public void setStatistiken(int statistiken) {
        statistiken = statistiken;
    }

    public List<DateiTyp> getDateien() {
        return dateien;
    }

    public void setDateien(List<DateiTyp> dateien) {
        this.dateien = dateien;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

