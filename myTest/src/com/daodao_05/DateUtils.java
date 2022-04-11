package com.daodao_05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private DateUtils() {}

    /*
        把日期转为指定格式的字符串
        返回值类型：String
        参数：Date date, String format
     */
    public static String dateToFormat(Date d, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(d);
    }

    /*
        把日期转为指定格式的字符串
        返回值类型：String
        参数：Date date, String format
     */
    public static Date formatToDate(String s, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
         return sdf.parse(s);
    }
}
