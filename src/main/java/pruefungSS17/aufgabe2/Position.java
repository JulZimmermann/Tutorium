package pruefungSS17.aufgabe2;

import java.util.Comparator;

import static java.util.Comparator.comparing;

public class Position implements Comparable<Position> {

    int zeilennummer;
    int spaltennummer;

    @Override
    public int compareTo(Position o) {
        if(zeilennummer < o.zeilennummer) {
            return -1;
        }

        if(zeilennummer > o.zeilennummer) {
            return 1;
        }

        if(spaltennummer < o.spaltennummer) {
            return -1;
        }

        if(spaltennummer > o.spaltennummer) {
            return 1;
        }

        return 0;
    }

    public int compareToAlternativ(Position o) {
        Comparator<Position> comp =
                Comparator.comparingInt((Position p) -> p.zeilennummer)
                .thenComparingInt((Position p) -> p.spaltennummer);

        return comp.compare(this, o);
    }

}
