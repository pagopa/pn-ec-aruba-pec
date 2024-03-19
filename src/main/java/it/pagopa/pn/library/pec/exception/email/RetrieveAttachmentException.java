package it.pagopa.pn.library.pec.exception.email;

public class RetrieveAttachmentException extends MimeMessageException{

    public RetrieveAttachmentException() {
        super("An error occurred while retrieving the attachment from the MimeMessage object");
    }

}
