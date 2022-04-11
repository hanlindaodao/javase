package com.daodao05;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for(int i=0; i<100; i++) {
            // 不可以直接使用getName()方法，因为没有像上一种方法一样继承Thread类
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
