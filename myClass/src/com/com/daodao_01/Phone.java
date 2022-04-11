package com.com.daodao_01;

public class Phone {
    String brand;   // 堆内存里
    int price;

    public void call() {
        System.out.println("call phone");
    }

    public void sendMessage() {
        System.out.println("sendMessage");
    }
}
