package com.daodao_02;

public class IntAndStringDemo {
    public static void main(String[] args) {
        // int ---> String
        // 1.
        int i1 = 100;
        String s1 = i1 + "";
        System.out.println(s1);

        //2.
        int i2 = 200;
        String s2 = String.valueOf(i2);
        System.out.println(s2);

        // String ---> int
        // 1.String --- Integer --- int
        String ss1 = "300";
        Integer integer1 = Integer.valueOf(ss1);
        int ii1 = integer1.intValue();
        System.out.println(ii1);

        // 2.
        String ss2 = "400";
        int ii2 = Integer.parseInt(ss2);
        System.out.println(ii2);
    }
}
