package com.daodao_05;

import java.text.ParseException;
import java.util.Date;

public class UseDateUtilsDemo {
    public static void main(String[] args) throws ParseException {
        String s = DateUtils.dateToFormat(new Date(), "yyyy年MM月dd日");
        System.out.println(s);

        Date date = DateUtils.formatToDate("1998-06-03", "yyyy-MM-dd");
        System.out.println(date);
    }
}
