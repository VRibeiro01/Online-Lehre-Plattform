package com.haw.se1lab;

public abstract class Aufgabenblatt {


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Aufgabe getAufgabe() {
        return Aufgabe;
    }

    public void setAufgabe(Aufgabe aufgabe) {
        Aufgabe = aufgabe;
    }

    public Themenbereich getThemenbereich() {
        return Themenbereich;
    }

    public void setThemenbereich(Themenbereich themenbereich) {
        Themenbereich = themenbereich;
    }

    public Kurs getKurs() {
        return Kurs;
    }

    public void setKurs(Kurs kurs) {
        Kurs = kurs;
    }

    public Aufgabe Aufgabe;
    public Themenbereich Themenbereich;
    public Kurs Kurs;
    public String Name;

   public Aufgabenblatt(String name, Themenbereich themenbereich,Aufgabe aufgabe, Kurs kurs){
       this.Name = name;
       this.Themenbereich = themenbereich;
       this.Kurs = kurs;
       this.Aufgabe = aufgabe;
   }
}
