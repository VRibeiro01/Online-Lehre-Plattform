package com.haw.se1lab;

import com.sun.xml.bind.v2.TODO;

import java.util.ArrayList;

public class Kurs {

    private ArrayList<Schueler> Teilnehmer;
    private Lehrer Verwalter;
    private NotenÜbersichtsTyp Notenuebersicht;
    private int Statistiken;

    public ArrayList<Schueler> getTeilnehmer() {
        return Teilnehmer;
    }

    public void setTeilnehmer(ArrayList<Schueler> teilnehmer) {
        Teilnehmer = teilnehmer;
    }

    public Lehrer getVerwalter() {
        return Verwalter;
    }

    public void setVerwalter(Lehrer verwalter) {
        Verwalter = verwalter;
    }

    public NotenÜbersichtsTyp getNotenuebersicht() {
        return Notenuebersicht;
    }

    public void setNotenuebersicht(NotenÜbersichtsTyp notenuebersicht) {
        Notenuebersicht = notenuebersicht;
    }
}
