package it.pagopa.pn.library.pec.exception.email;

public class RetrieveFromException extends MimeMessageException {

    public RetrieveFromException() {
        super("An error occurred while retrieving the from address from the MimeMessage object");
    }
}
