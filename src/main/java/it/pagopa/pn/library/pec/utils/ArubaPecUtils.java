package it.pagopa.pn.library.pec.utils;

public class ArubaPecUtils {

    private ArubaPecUtils() {
        throw new IllegalStateException("LogUtils is a utility class");
    }

    public static final String ARUBA_MESSAGE_MISSING = "The message '{}' is missing from folder";

    public static final String CLIENT_METHOD_INVOCATION_WITH_ARGS = "Client method {} - args: {}";
    public static final String CLIENT_METHOD_RETURN = "Return client method: {} = {}";

    //ARUBA
    public static final String ARUBA_MARK_MESSAGE_AS_READ = "ArubaService.markMessageAsRead()";
    public static final String ARUBA_SEND_MAIL = "ArubaService.sendMail()";
    public static final String ARUBA_GET_MESSAGE_COUNT = "ArubaService.getMessageCount()";
    public static final String ARUBA_DELETE_MAIL = "ArubaService.deleteMail()";
    public static final String ARUBA_GET_UNREAD_MESSAGES = "ArubaService.getUnreadMessages()";

    public static final String ERRORE_CONSEGNA = "errore-consegna";
    public static final String PREAVVISO_ERRORE_CONSEGNA = "preavviso-errore-consegna";


}
