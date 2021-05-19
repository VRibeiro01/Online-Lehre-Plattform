package com.haw.se1lab;


public class Aufgaben {

    private String themenbereich;
    private String aufgabenstellung;
    private int erreichbarePunkte;
    private String notiz;


    public Aufgaben(String themenbereich, String aufgabenstellung, int erreichbarePunkte, String notiz) {
        this.themenbereich = themenbereich;
        this.aufgabenstellung = aufgabenstellung;
        this.erreichbarePunkte = erreichbarePunkte;
        this.notiz = notiz;
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
}
