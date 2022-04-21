package com.bilgeadam.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    public static boolean afterFromNowDate(String dateString) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy/MM/dd HH:mm:ss");

        try {
            // "2022/04/03 13:32:45"
            Date date = simpleDateFormat.parse(dateString);
            Date now = new Date(System.currentTimeMillis());
            return now.after(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return false;
    }
}
