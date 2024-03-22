package it.pagopa.pn.library.pec.exception.email;

public class RetrieveContentException extends MimeMessageException{

    public RetrieveContentException() {
        super("An error occurred while retrieving the content from the MimeMessage object");
    }

}
