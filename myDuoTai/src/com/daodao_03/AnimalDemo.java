package com.daodao_03;

/**
 * 多态的转型：向上转型和向下转型
 */

public class AnimalDemo {
    public static void main(String[] args) {
        // 向上转型
        Animal a = new Cat();
        a.eat();
//        a.playGame();

/*
        Cat c = new Cat();
        c.eat();
        c.playGame();
*/

        // 向下转型
        Cat c = (Cat)a;
        c.eat();
        c.playGame();
    }
}
