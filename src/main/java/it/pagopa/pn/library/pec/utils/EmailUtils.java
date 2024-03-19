package it.pagopa.pn.library.pec.utils;


import lombok.CustomLog;

@CustomLog
public class EmailUtils {

    private static final String C_DATA_TAG = "<![CDATA[%s]]>";

    public static String getMimeMessageInCDATATag(byte[] fileBytes) {
        return String.format(C_DATA_TAG, new String(fileBytes));
    }

}