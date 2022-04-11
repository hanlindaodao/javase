package com.daodao01;

/**
 * 泛型类的使用
 *      格式见Generic.java
 */

public class GenericDemo {
    public static void main(String[] args) {
        Generic<String> generic = new Generic<String>();

        generic.setT("aaa");
        System.out.println(generic.getT());

        Generic<Integer> generic_2 = new Generic<Integer>();

        generic_2.setT(123);
        System.out.println(generic_2.getT());
    }
}
