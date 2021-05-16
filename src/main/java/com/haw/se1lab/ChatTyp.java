package com.haw.se1lab;

import java.util.LinkedList;
import java.util.Queue;

public class ChatTyp{

    public String nutzerEmail;       // Prüfen, ob Email einem Benutzer gehört
    public Queue<String> chat;

    public ChatTyp(String UserEmail){
        this.nutzerEmail = UserEmail;
        this.chat = new LinkedList<>();

    }
    public String getNutzerEmail() {
        return nutzerEmail;
    }

    public Queue getChat(){
        return chat;
    }
}

