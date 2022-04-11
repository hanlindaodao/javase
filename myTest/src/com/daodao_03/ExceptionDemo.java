package com.daodao_03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("begin");
        method_2();
        System.out.println("end");
    }

    // 编译是异常
    public static void method_2() {
        try {
            String s = "2021-03-16";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse(s);
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


    // 运行时异常
    private static void method_1() {
        int[] arr = {1, 2, 3};
//        System.out.println(arr[3]);

        try {
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}

