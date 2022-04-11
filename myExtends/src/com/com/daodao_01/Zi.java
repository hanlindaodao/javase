package com.com.daodao_01;

public class Zi extends Fu{
    public int height = 180;
    public int age = 22;

    public void show() {
        int age = 24;
        System.out.println(age);
        System.out.println(height);
//        System.out.println(weight);
        System.out.println("---");
        System.out.println(age);
        System.out.println(this.age);
        System.out.println(super.age);
    }
}
