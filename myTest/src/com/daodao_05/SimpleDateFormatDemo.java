package com.daodao_05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  格式化(从Date到String)
 *    public final String format(Date date)：将日期格式化成日期/时间字符串
 *  解析(从String到Date)
 *    public Date parse(String source)：从给定字符串的开始解析文本以生成日期
 */

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        Date d_1 = new Date();
        System.out.println(d_1);
        SimpleDateFormat sdf_1 = new SimpleDateFormat();
        String s_1 = sdf_1.format(d_1);
        System.out.println(s_1);
        SimpleDateFormat sdf_2 = new SimpleDateFormat("yyyy-MM-dd");
        String s_2 = sdf_2.format(d_1);
        System.out.println(s_2);

        String s_3 = "2021-04-01";
        Date d_2 = sdf_2.parse(s_3);
        System.out.println(d_2);

    }
}
