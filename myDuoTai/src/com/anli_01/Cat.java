package com.anli_01;

public class Cat extends Animal{

    @Override
    public String toString() {
        return "Cat---> " + super.toString();
    }

    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("Cat eat fish.");
    }
}
