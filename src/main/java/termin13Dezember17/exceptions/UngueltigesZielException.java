package termin13Dezember17.exceptions;

public class UngueltigesZielException extends Exception {

    private String ziel;

    public UngueltigesZielException(String ziel) {
        this.ziel = ziel;
    }

    public UngueltigesZielException(String ziel, String message) {
        super(message);
        this.ziel = ziel;
    }

    public UngueltigesZielException(String ziel, String message, Throwable cause) {
        super(message, cause);
        this.ziel = ziel;
    }

    public UngueltigesZielException(String ziel, Throwable cause) {
        super(cause);
        this.ziel = ziel;
    }

    public String getZiel() {
        return ziel;
    }


}
