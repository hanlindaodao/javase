package com.anli_01;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.setName("haha");
        a.setAge(5);
        System.out.println("name:" + a.getName());
        System.out.println("age:" + a.getAge());
        a.eat();

        a = new Cat("haha", 5);
        System.out.println("name:" + a.getName());
        System.out.println("age:" + a.getAge());
        a.eat();

        System.out.println(a);
        System.out.println(a.toString());

    }
}
