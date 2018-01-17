package termin17Januar18.uebung;

public class Spieler {

    private String name;
    private int ranking;

    public Spieler(String name, int ranking) {
        this.name = name;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Spieler spieler = (Spieler) o;

        if (ranking != spieler.ranking) return false;
        return name != null ? name.equals(spieler.name) : spieler.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + ranking;
        return result;
    }

}
