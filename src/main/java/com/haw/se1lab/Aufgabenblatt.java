package com.haw.se1lab;

import java.util.ArrayList;
import java.util.List;

public abstract class Aufgabenblatt {


    public List<Aufgaben> aufgaben;
    public String themenbereich;
    public Kurs kurs;
    public String name;
    private Lehrer ersteller;
    private Schueler bearbeiter;


   public Aufgabenblatt(String name, String themenbereich, Kurs kurs, Lehrer ersteller,Schueler bearbeiter){
       this.name = name;
       this.themenbereich = themenbereich;
       this.kurs = kurs;
       this.aufgaben = new ArrayList<>();
       this.ersteller = ersteller;
       this.bearbeiter = bearbeiter;
   }

    public List<Aufgaben> getAufgaben() {
        return aufgaben;
    }

    public void setAufgaben(List<Aufgaben> aufgaben) {
        this.aufgaben = aufgaben;
    }

    public String getThemenbereich() {
        return themenbereich;
    }

    public void setThemenbereich(String themenbereich) {
        this.themenbereich = themenbereich;
    }

    public Kurs getKurs() {
        return kurs;
    }

    public void setKurs(Kurs kurs) {
        this.kurs = kurs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Lehrer getErsteller() {
        return ersteller;
    }

    public void setErsteller(Lehrer ersteller) {
        this.ersteller = ersteller;
    }

    public Schueler getBearbeiter() {
        return bearbeiter;
    }

    public void setBearbeiter(Schueler bearbeiter) {
        this.bearbeiter = bearbeiter;
    }
}
