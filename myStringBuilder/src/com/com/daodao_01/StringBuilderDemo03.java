package com.com.daodao_01;

/**
 * StringBuilder和String相互转换
 */

public class StringBuilderDemo03 {
    public static void main(String[] args) {
/*
        StringBuilder sb = new StringBuilder();
        sb.append("hello");

//        System.out.println(sb);
        String s = sb.toString();

        System.out.println(s);
*/
        String s = "hello";

        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
    }
}
