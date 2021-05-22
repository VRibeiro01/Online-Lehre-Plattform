package com.haw.se1lab;

import com.sun.xml.bind.v2.TODO;

import java.util.ArrayList;
import java.util.List;

public class Kurs {

    private String name;
    private List<Schueler> teilnehmer;
    private Lehrer verwalter;
    private int statistiken;
    private List<DateiTyp> dateien;

    public Kurs(String name, Lehrer verwalter, int statistiken, List<DateiTyp> dateien) {
        this.name = name;
        this.teilnehmer = new ArrayList<>();
        this.verwalter = verwalter;
        this.statistiken = statistiken;
        this.dateien = new ArrayList<>();
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
}
