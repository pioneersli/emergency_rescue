package com.emergency.rescue.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    public static SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static SimpleDateFormat simpleDateFormat_sss=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");

    public static String getTime(Date date){
        return simpleDateFormat.format(date);
    }

    public static String getTimeStr(String date) throws ParseException {
        return simpleDateFormat.format(simpleDateFormat_sss.parse(date));
        //return simpleDateFormat.format(date);
    }


}
