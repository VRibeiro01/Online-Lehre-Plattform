package com.haw.se1lab;

public class Aufgabe {

    private Themenbereich themenbereich;
    private String aufgabenstellung;
    private int erreichbarePunkte;

    public Aufgabe(Themenbereich themenbereich, String aufgabenstellung, int erreichbarePunkte){
        this.themenbereich=themenbereich;
        this.aufgabenstellung=aufgabenstellung;
        this.erreichbarePunkte=erreichbarePunkte;
    }

    public Themenbereich getThemenbereich() {
        return themenbereich;
    }

    public void setThemenbereich(Themenbereich themenbereich) {
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
}
