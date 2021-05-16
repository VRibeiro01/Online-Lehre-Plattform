package com.haw.se1lab;

public class Lehrer {
    private String Name;
    private KursListeTyp Kurse;
    private ChatTyp Chat;
    private String Email;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Lehrer(String name, String email) {
        Name = name;
        Email = email;
    }
}

