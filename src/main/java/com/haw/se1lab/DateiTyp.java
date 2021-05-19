package com.haw.se1lab;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class DateiTyp {

    private URL datei;



    public DateiTyp(String host, String port, String file) throws MalformedURLException {
        this.datei = new URL(host,port,file);
    }

    public URL getDatei() {
        return datei;
    }


}
