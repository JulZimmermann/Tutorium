package termin20Dezember17;

public class KeineZahlException extends Exception {

    private String uebergebenerString;

    public KeineZahlException(String uebergebenerString) {
        this.uebergebenerString = uebergebenerString;
    }

    public String getUebergebenerString() {
        return uebergebenerString;
    }
}
