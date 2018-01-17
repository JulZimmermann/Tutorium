package termin17Januar18.uebung;

import java.util.ArrayList;
import java.util.List;

public class Mannschaft {

    private String name;
    private List<Spieler> spieler = new ArrayList<>();

    public Mannschaft(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Spieler> getSpieler() {
        return spieler;
    }

    public void addSpieler(Spieler spieler) {
        this.spieler.add(spieler);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Mannschaft manschaft = (Mannschaft) o;

        if (name != null ? !name.equals(manschaft.name) : manschaft.name != null) return false;
        return spieler != null ? spieler.equals(manschaft.spieler) : manschaft.spieler == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (spieler != null ? spieler.hashCode() : 0);
        return result;
    }

}
