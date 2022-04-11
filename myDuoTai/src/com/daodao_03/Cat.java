package com.daodao_03;

public class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("Cat eat fish.");
    }

    public void playGame() {
        System.out.println("Cat can play.");
    }
}
