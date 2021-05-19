package com.haw.se1lab;

import java.util.LinkedList;
import java.util.Queue;

public class Aufgabe {

    private Themenbereich themenbereich;
    private Queue<String> aufgabenstellung;
    private int erreichbarePunkte;

    public Aufgabe(Themenbereich themenbereich, int erreichbarePunkte){
        this.themenbereich=themenbereich;
        this.aufgabenstellung=new LinkedList<>();
        this.erreichbarePunkte=erreichbarePunkte;
    }

    public void setAufgabenstellung(Queue<String> aufgabenstellung) {
        this.aufgabenstellung = aufgabenstellung;
    }

    public Themenbereich getThemenbereich() {
        return themenbereich;
    }

    public void setThemenbereich(Themenbereich themenbereich) {
        this.themenbereich = themenbereich;
    }

    public Queue getAufgabenstellung() {
        return aufgabenstellung;
    }

       public int getErreichbarePunkte() {
        return erreichbarePunkte;
    }

    public void setErreichbarePunkte(int erreichbarePunkte) {
        this.erreichbarePunkte = erreichbarePunkte;
    }
}
