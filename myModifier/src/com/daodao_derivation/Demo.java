package com.daodao_derivation;

import com.daodao_origin.Fu;

public class Demo {

    // 不同包下的无关类测试：只有public可以访问，其他三个都不可以访问了，protected这个时候不可以了
    public static void main(String[] args) {

        Fu fu = new Fu();

//        fu.show1();
//        fu.show2();
//        fu.show3();
        fu.show4();
    }
}
