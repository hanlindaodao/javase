package com.daodao02;

/**
 * 使用泛型类改进方法重载
 */

/*
// 这里改成泛型类，见下边
public class Generic {
    public void show(String s) {
        System.out.println(s);
    }

    public void show(Integer i) {
        System.out.println(i);
    }

    public void show(Boolean b) {
        System.out.println(b);
    }
}
*/

public class Generic<T> {
    public void show(T t) {
        System.out.println(t);
    }
}