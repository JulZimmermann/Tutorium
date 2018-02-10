package termin17Januar18.uebung;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Mannschaft implements Comparable<Mannschaft> {

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

    public double avgRanking() {
        int summ = 0;
        for(Spieler spieler : spieler) {
            summ += spieler.getRanking();
        }

        return ((double)summ) / spieler.size();
    }

    public double avgMitLambda() {
        return spieler.stream().mapToDouble(Spieler::getRanking).average().orElse(0);
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

    @Override
    public int compareTo(Mannschaft other) {
        double avgRankingThis = avgRanking();
        double avgRankingOther = other.avgRanking();

        if(avgRankingThis < avgRankingOther) return -1;
        if(avgRankingThis > avgRankingOther) return 1;
        return 0;
    }

    public int compareToAlternative(Mannschaft other) {
        return Double.compare(avgRanking(), other.avgRanking());
    }


}
