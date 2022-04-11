package com.daodao_02;

public class IntAndIntegerDemo {
    public static void main(String[] args) {
        // int ---> Integer
        // 1.
        Integer integer_1 = new Integer(111);
        System.out.println(integer_1);

        // 2.
        Integer integer_2 = new Integer("222");
        System.out.println(integer_2);

        // 3.
        Integer integer_3 = Integer.valueOf(333);
        System.out.println(integer_3);

        // 4.
        Integer integer_4 = Integer.valueOf("444");
        System.out.println(integer_4);

        // Integer ---> int
        Integer integer_5 = Integer.valueOf(555);
        int i = integer_5.intValue();
        System.out.println(i);
    }
}
