package termin13Dezember17;

public class MatrikelNummerException extends Exception {

    public MatrikelNummerException() {
    }

    public MatrikelNummerException(String message) {
        super(message);
    }

    public MatrikelNummerException(String message, Throwable cause) {
        super(message, cause);
    }

    public MatrikelNummerException(Throwable cause) {
        super(cause);
    }

    public MatrikelNummerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
