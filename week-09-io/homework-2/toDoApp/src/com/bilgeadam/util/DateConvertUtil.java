package com.bilgeadam.util;

import com.bilgeadam.io.ErrorWriter;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConvertUtil {

    public static Date stringConvertToDate(String dateString){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return simpleDateFormat.parse(dateString);
        }catch (ParseException parseException){
            try (ErrorWriter errorWriter = new ErrorWriter();){
                errorWriter.write(parseException);
            }catch (IOException ioException){
                System.err.println(ioException.getMessage());
            }

        }
        return new Date(System.currentTimeMillis());
    }
}
