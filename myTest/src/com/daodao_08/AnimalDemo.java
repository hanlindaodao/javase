package com.daodao_08;

public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperator ao = new AnimalOperator();

        Cat cat = new Cat();
        ao.operatorEat(cat);

        ao.operatorEat(new Dog());
    }
}
