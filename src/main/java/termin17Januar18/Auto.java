package termin17Januar18;

public class Auto implements Comparable<Auto> {

    public int ps;
    private String farbe;
    public String kennzeichen;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Auto auto = (Auto) o;

        if (ps != auto.ps) return false;
        if (farbe != null ? !farbe.equals(auto.farbe) : auto.farbe != null) return false;
        return kennzeichen != null ? kennzeichen.equals(auto.kennzeichen) : auto.kennzeichen == null;
    }

    @Override
    public int hashCode() {
        int result = ps;
        result = 31 * result + (farbe != null ? farbe.hashCode() : 0);
        result = 31 * result + (kennzeichen != null ? kennzeichen.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(Auto o) {
        if(ps < o.ps) return -1;
        if(ps > o.ps) return 1;
        return 0;
    }
}
