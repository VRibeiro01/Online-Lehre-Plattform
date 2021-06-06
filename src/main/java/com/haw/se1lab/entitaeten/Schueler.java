package com.haw.se1lab.entitaeten;

import com.haw.se1lab.entitaeten.Person;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Schueler extends Person {

   /* @Id
    @GeneratedValue
    private Long id;*/

    public Schueler(String name, String email) {
        super(name, email);
    }


    public Schueler() {
    }

 /*   public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }*/
}