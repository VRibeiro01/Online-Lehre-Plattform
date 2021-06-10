package allg.haw.se1lab.grundlage.allgemein.api.datentyp;

import javax.persistence.Embeddable;
import java.net.MalformedURLException;
import java.net.URL;

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
