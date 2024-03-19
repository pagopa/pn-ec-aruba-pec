package it.pagopa.pn.library.pec.exception.aruba;

public class ArubaCallMaxRetriesExceededException extends Exception {

    public ArubaCallMaxRetriesExceededException() {
        super("Aruba call max retries exceeded");
    }

    public ArubaCallMaxRetriesExceededException(String message) {
        super(message);
    }

    public ArubaCallMaxRetriesExceededException(String message, Throwable cause) {
        super(message, cause);
    }

}
