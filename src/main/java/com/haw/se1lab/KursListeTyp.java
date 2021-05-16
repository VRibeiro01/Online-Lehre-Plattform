package com.haw.se1lab;

import java.util.ArrayList;

public class KursListeTyp {

    public ArrayList<Kurs> KursListe;

    public KursListeTyp(){
        this.KursListe = new ArrayList<>();
    }

    public ArrayList getKursListe(){
        return KursListe;
    }

}
