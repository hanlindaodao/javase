package com.daodao_04;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date d_1 = new Date();
        System.out.println(d_1);

        Date d_2 = new Date(0);
        System.out.println(d_2);
        Date d_3 = new Date(1000);
        System.out.println(d_3);

        Date d_4 = new Date();
        long time = d_4.getTime();
        System.out.println(time);
        System.out.println(System.currentTimeMillis());

        System.out.println(d_4);
        d_4.setTime(time - 1000);
        System.out.println(d_4);
    }
}
