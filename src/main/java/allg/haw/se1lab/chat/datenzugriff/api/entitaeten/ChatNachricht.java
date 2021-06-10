package allg.haw.se1lab.chat.datenzugriff.api.entitaeten;

import allg.haw.se1lab.nutzer.datenzugriff.api.entitaeten.Person;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ChatNachricht {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Person sender;

    @ManyToOne
    private Person empfaenger;

    private String nachricht;

    public ChatNachricht(Person sender, Person empfaenger, String nachricht) {
        this.sender = sender;
        this.empfaenger = empfaenger;
        this.nachricht = nachricht;
    }

    public ChatNachricht() {
    }


    public Person getSender() {
        return sender;
    }

    public void setSender(Person sender) {
        this.sender = sender;
    }

    public Person getEmpfaenger() {
        return empfaenger;
    }

    public void setEmpfaenger(Person empfaenger) {
        this.empfaenger = empfaenger;
    }

    public String getNachricht() {
        return nachricht;
    }

    public void setNachricht(String nachricht) {
        this.nachricht = nachricht;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
