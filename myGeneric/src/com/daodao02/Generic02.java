package com.daodao02;

/**
 * 使用泛型方法
 * 在创建对象的时候不需要去规定泛型
 */

// 泛型类
/*
public class Generic02<T> {
    public void show(T t) {
        System.out.println(t);
    }
}
*/

// 泛型方法
public class Generic02 {
    public <T> void show(T t) {
        System.out.println(t);
    }
}
