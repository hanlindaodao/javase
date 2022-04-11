package com.com.daodao_02;

public class Outer {

    private int num = 10;

    public class Inner {
        public void show() {
            System.out.println(num);
        }
    }

    // 一般用private
    private class Inner_2 {
        public void show_2() {
            System.out.println(num);
        }
    }

    public void method() {
        Inner i = new Inner();
        i.show();
    }
}
