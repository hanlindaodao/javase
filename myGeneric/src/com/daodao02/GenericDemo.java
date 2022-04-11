package com.daodao02;

public class GenericDemo {
    public static void main(String[] args) {
        Generic g = new Generic();

        // 这里每增加一个类型，就需要在Generic里增加一个方法的重载，比较繁琐，可以尝试使用泛型类，这是第一个方法
        g.show("abc");
        g.show(123);
        g.show(true);

        // 在给为泛型类之前不可以随意增加下边这一条
        g.show(12.34);

/*        Generic02<String> g2 = new Generic02<String>();
        g2.show("abs");

        Generic02<Boolean> g3 = new Generic02<Boolean>();
        g3.show(true);*/

        Generic02 g4 = new Generic02();
        g4.show("asd");
        g4.show(123);
        g4.show(true);


    }
}
