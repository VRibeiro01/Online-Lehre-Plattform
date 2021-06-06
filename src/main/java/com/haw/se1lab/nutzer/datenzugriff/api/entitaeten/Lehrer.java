package com.haw.se1lab.nutzer.datenzugriff.api.entitaeten;
import javax.persistence.Entity;


@Entity
public class Lehrer extends Person {


    public Lehrer(String name, String email) {
        super(name, email);
    }

    public Lehrer() {
    }



}

