package pruefungSS17.aufgabe2;

import java.util.*;

public class WortVorkommen {

    private Map<Wort, List<Position>> positionen = new HashMap<>();

    public void einfuegen(Wort wort, Position position) {

        if(!positionen.containsKey(wort)) {
            positionen.put(wort, new ArrayList<>());
        }

        positionen.get(wort).add(position);
    }

    public Collection<Position> hohleAlle(Wort wort) {
        return positionen.get(wort);
    }

    public Position hohleLetze(Wort wort) {
        List<Position> copy = new ArrayList<>(positionen.get(wort));
        Collections.sort(copy);

        return copy.get(copy.size()-1);
    }

    public int anzahlVorkommen(Wort wort) {
        List<Position> pos = positionen.get(wort);

        if(pos != null) {
            return pos.size();
        }

        return 0;
    }


}
