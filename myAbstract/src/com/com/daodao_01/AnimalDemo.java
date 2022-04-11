package com.com.daodao_01;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("haha");
        a.setAge(1);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
        System.out.println("8888888888");

        a = new Cat("hahaha", 2);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
    }
}
