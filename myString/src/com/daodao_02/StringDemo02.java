package com.daodao_02;

public class StringDemo02 {
    public static void main(String[] args) {
        // 构造方法的方式得到的对象
        char[] chs = {'a', 'b', 'c'};
        String s1 = new String(chs);
        String s2 = new String(chs);
        System.out.println(s1 == s2);

        // 直接赋值的方式得到的对象
        String s3 = "abc";
        String s4 = "abc";
        System.out.println(s3 == s4);
        System.out.println(s1 == s3);


        System.out.println("_________");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
    }
}
