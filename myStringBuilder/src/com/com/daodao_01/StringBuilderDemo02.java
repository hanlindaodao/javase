package com.com.daodao_01;

/**
 * StringBuilder的添加和反转
 */

public class StringBuilderDemo02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

//        StringBuilder sb2 = sb.append("hello");
//        System.out.println("sb:" + sb);
//        System.out.println("sb2:" + sb2);
//        System.out.println(sb == sb2);\

//        sb.append("helle");
//        sb.append("world");
//        sb.append(100);

        sb.append("hello ").append("world").append(100);
        System.out.println(sb);


        sb.reverse();
        System.out.println(sb);
    }
}
