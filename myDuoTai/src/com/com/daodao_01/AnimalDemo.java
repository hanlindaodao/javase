package com.com.daodao_01;

/**
 * 多态中成员访问特点：
 *      因为成员方法有重写，成员变量没有
 * 成员变量：编译看左边，执行看左边
 * 成员方法：编译看左边，执行看右边
 */

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();

        System.out.println(a.age);
//        System.out.println(a.weight);

        a.eat();
//        a.playGame();
    }
}
