package com.com.daodao_01;

public class Cat extends Animal{
    public int age = 20;
    public int weight = 10;

    @Override
    public void eat() {
        System.out.println("Cat eat fish.");
    }

    public void playGame() {
        System.out.println("Can play.");
    }
}
