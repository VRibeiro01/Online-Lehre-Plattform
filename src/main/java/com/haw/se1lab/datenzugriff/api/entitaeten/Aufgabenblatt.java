package com.haw.se1lab.datenzugriff.api.entitaeten;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@MappedSuperclass
public abstract class Aufgabenblatt {

    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    private List<Aufgabe> aufgaben;

    private String themenbereich;

    @ManyToOne
    private Kurs kurs;

    private String name;

    @ManyToOne
    private Lehrer ersteller;

    @ManyToOne
    private Schueler bearbeiter;


   public Aufgabenblatt(String name, String themenbereich, Kurs kurs, Lehrer ersteller,Schueler bearbeiter){
       this.name = name;
       this.themenbereich = themenbereich;
       this.kurs = kurs;
       this.aufgaben = new ArrayList<>();
       this.ersteller = ersteller;
       this.bearbeiter = bearbeiter;
   }

   public Aufgabenblatt(){}

    public List<Aufgabe> getAufgaben() {
        return aufgaben;
    }

    public void setAufgaben(List<Aufgabe> aufgaben) {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

