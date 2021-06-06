package com.haw.se1lab.datenzugriff.api.entitaeten;

import javax.persistence.*;

@Entity
@Inheritance
public abstract class Person {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Default-Konstruktor wegen Klassen Schueler, Lehrer gefordert
    public Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
