package com.haw.se1lab;

public class Schueler {
    private String Name;
    private String Email;
    private KursListeTyp Kurse;
    private ChatTyp Chat;
    private NotenÜbersichtsTyp Notenuebersicht;


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public NotenÜbersichtsTyp getNotenübersicht() {
        return Notenuebersicht;
    }

    public void setNotenuebersicht(NotenÜbersichtsTyp notenuebersicht) {
        Notenuebersicht = notenuebersicht;
    }

    public KursListeTyp getKurse() {
        return Kurse;
    }

    public void setKurse(KursListeTyp kurse) {
        Kurse = kurse;
    }

    public ChatTyp getChat() {
        return Chat;
    }

    public void setChat(ChatTyp chat) {
        Chat = chat;
    }

    public Schueler(String name, String email) {
        Name = name;
        Email = email;
    }

}