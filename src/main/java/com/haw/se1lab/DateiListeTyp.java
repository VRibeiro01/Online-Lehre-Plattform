package com.haw.se1lab;

import java.io.File;
import java.util.ArrayList;

public class DateiListeTyp {

    public ArrayList<File> dateien;


    public DateiListeTyp() {
        this.dateien = new ArrayList<>();
    }

    public ArrayList<File> getDateien() {
        return dateien;
    }
}
