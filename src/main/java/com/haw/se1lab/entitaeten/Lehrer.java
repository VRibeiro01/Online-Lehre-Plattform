package com.haw.se1lab.entitaeten;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Lehrer extends Person {


    public Lehrer(String name, String email) {
        super(name, email);
    }

    public Lehrer() {
    }



}

