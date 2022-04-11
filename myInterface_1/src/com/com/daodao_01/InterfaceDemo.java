package com.com.daodao_01;

public class InterfaceDemo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
        System.out.println(i.num1);
        System.out.println(i.num2);

//        i.num1 = 11;
//        i.num2 = 22;
        System.out.println(i.num1);
        System.out.println(i.num2);

        System.out.println(Inter.num1);
        System.out.println(Inter.num2);
        System.out.println(Inter.num3);
    }
}
