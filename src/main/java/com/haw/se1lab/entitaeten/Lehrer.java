package com.haw.se1lab.entitaeten;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Lehrer extends Person {


    @Id
    @GeneratedValue
    private Long id;

    public Lehrer(String name, String email) {
        super(name, email);
    }

    public Lehrer() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

