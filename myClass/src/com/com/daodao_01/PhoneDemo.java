package com.com.daodao_01;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();

        System.out.println(p.brand);
        System.out.println(p.price);

        p.brand = "mi";
        p.price = 123;

        System.out.println(p.brand);
        System.out.println(p.price);

        p.call();
        p.sendMessage();
    }
}
