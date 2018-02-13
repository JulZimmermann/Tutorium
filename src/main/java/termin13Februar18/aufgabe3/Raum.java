package termin13Februar18.aufgabe3;

import java.io.Serializable;

public class Raum implements Serializable {

    private String bezeichnung;
    private int stockwerk;

    public Raum(String bezeichnung, int stockwerk) {
        this.bezeichnung = bezeichnung;
        this.stockwerk = stockwerk;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public int getStockwerk() {
        return stockwerk;
    }

    public void setStockwerk(int stockwerk) {
        this.stockwerk = stockwerk;
    }

}
