package com.haw.se1lab;

public class ChatNachricht {

    private Person sender;
    private Person empfaenger;
    private String nachricht;

    public ChatNachricht(Person sender, Person empfaenger, String nachricht) {
        this.sender = sender;
        this.empfaenger = empfaenger;
        this.nachricht = nachricht;
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
}
