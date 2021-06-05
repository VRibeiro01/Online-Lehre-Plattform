package com.haw.se1lab.datentypen;

import javax.persistence.Embeddable;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

@Embeddable
public class DateiTyp {

    private URL datei;



    public DateiTyp(String host, String port, String file) throws MalformedURLException {
        this.datei = new URL(host,port,file);
    }

    public DateiTyp() {

    }

    public URL getDatei() {
        return datei;
    }

    public void setDatei(URL datei) {
        this.datei = datei;
    }
}
