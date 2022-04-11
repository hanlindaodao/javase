package com.com.daodao_01;

public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }

    @Override
    public void eat() {
        System.out.println("Cat eat fish.");
    }
}
