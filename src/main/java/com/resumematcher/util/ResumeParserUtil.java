package com.resumematcher.util;

import org.apache.tika.Tika;
import java.io.InputStream;

public class ResumeParserUtil {
    public static String extractText(InputStream inputStream) {
        try {
            Tika tika = new Tika();
            return tika.parseToString(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
