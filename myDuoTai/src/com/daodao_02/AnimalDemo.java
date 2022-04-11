package com.daodao_02;

/**
 * 多态的好处和弊端
 */

public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperator ao = new AnimalOperator();
        Cat c = new Cat();
        ao.useAnimal(c);

        ao.useAnimal(new Dog());
        ao.useAnimal(new Pig());


    }
}
