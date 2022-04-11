package com.daodao_origin;

public class Zi extends Fu{

    // 同一包下子类测试：private不可以，其他三个都可以
    public static void main(String[] args) {
        Zi zi = new Zi();


//        zi.show1();
        zi.show2();
        zi.show3();
        zi.show4();

    }
}
