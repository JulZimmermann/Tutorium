package pruefungSS17.aufgabe1;

public class FalscheIBANException extends Exception {

    public FalscheIBANException() {
        super("FEHLER: Datei enthält ungultige IBAN");
    }

    public FalscheIBANException (String msg) {
        super(msg);
    }

}
