package termin13Februar18.aufgabe3;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public class Haus implements Comparable<Haus>, Iterable<Raum>, Serializable {

    private List<Raum> raueme;

    String adresse;
    String besitzer;

    public Haus(List<Raum> raueme, String adresse, String besitzer) {
        this.raueme = raueme;
        this.adresse = adresse;
        this.besitzer = besitzer;
    }

    @Override
    public int compareTo(Haus o) {
        if(raueme.size() < o.raueme.size()) {
            return -1;
        }
        if(raueme.size() > o.raueme.size()) {
            return 1;
        }
        return 0;
    }

    @Override
    public Iterator<Raum> iterator() {
        return new Iterator<Raum>() {

            int i = 0;

            @Override
            public boolean hasNext() {
                return i < raueme.size();
            }

            @Override
            public Raum next() {
                Raum r = raueme.get(i);
                i++;
                return r;
            }
        };
    }
}
