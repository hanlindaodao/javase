package com.daodao_derivation;

import com.daodao_origin.Fu;

public class Zi extends Fu {

    // 不同包下的子类访问测试：private和默认不可以访问，只有protected和public可以访问
    public static void main(String[] args) {
        Zi zi = new Zi();

//        zi.show1();
//        zi.show2();
        zi.show3();
        zi.show4();
    }
}
