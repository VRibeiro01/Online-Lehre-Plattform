package com.haw.se1lab;

import org.springframework.ui.context.Theme;

public class Unterrichtsaufgaben extends Aufgabenblatt{


    public Unterrichtsaufgaben(String name, Themenbereich themenbereich,Aufgabe aufgabe, Kurs kurs){
        super(name,themenbereich,aufgabe,kurs);
    }


}
