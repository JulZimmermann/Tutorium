package termin20Dezember17.serializableGenerisch;

import java.io.Serializable;

public class Auto implements Serializable {

    private int ps;
    private String farbe;

    public Auto(int ps, String farbe) {
        this.ps = ps;
        this.farbe = farbe;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

}
