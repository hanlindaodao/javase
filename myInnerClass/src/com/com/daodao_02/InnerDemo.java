package com.com.daodao_02;

/**
 * 成员内部类
 */

public class InnerDemo {
    public static void main(String[] args) {
//        Inner i = new Inner();

        Outer.Inner oi = new Outer().new Inner();
        oi.show();

//        private以后上边就不行了
//        Outer.Inner_2 oi_2 = new Outer.new Inner_2();
        Outer o = new Outer();
        o.method();
    }
}
