package it.pagopa.pn.library.pec.exception.email;

public class RetrieveMessageIdException extends MimeMessageException {

    public RetrieveMessageIdException() {
        super("An error occurred while retrieving the message id from the MimeMessage object");
    }
}
