package termin20Dezember17;

public class Addierer {

    public static String addiere(String s1, String s2) throws KeineZahlException {
        double d1;
        double d2;

        try {
            d1 = Double.parseDouble(s1);
        } catch(NumberFormatException e) {
            throw new KeineZahlException(s1);
        }

        try {
            d2 = Double.parseDouble(s2);
        } catch(NumberFormatException e) {
            throw new KeineZahlException(s2);
        }

        double erg = d1 + d2;

        if(erg == Math.round(erg)) {
            return "" + (int) erg;
        }

        return "" + (Math.round(erg* 100)/100.0);
    }

}
