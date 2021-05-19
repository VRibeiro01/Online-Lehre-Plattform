package com.haw.se1lab;

public class ChatNachricht {

    private Person sender;
    private Person empfänger;
    private String nachricht;

    public ChatNachricht(Person sender, Person empfänger, String nachricht) {
        this.sender = sender;
        this.empfänger = empfänger;
        this.nachricht = nachricht;
    }


    public Person getSender() {
        return sender;
    }

    public void setSender(Person sender) {
        this.sender = sender;
    }

    public Person getEmpfänger() {
        return empfänger;
    }

    public void setEmpfänger(Person empfänger) {
        this.empfänger = empfänger;
    }

    public String getNachricht() {
        return nachricht;
    }

    public void setNachricht(String nachricht) {
        this.nachricht = nachricht;
    }
}
