package com.daodao01;
/*
    方式1：继承Thread类
        1:定义一个类MyThread继承Thread类
        2:在MyThread类中重写run()方法
        3:创建MyThread类的对象
        4:启动线程


        注意：run()方法是用来封装被线程执行的代码的，因为MyThread里有可能有其他代码,并不是所有的代码都需要被线程执行，其作用是为了区分哪些代码是会被线程执行的
 */
public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();

        // 直接调用run()相当于普通的方法调用，并没有启动多线程
//        my1.run();
//        my2.run();

//        //void start() 导致此线程开始执行; Java虚拟机调用此线程的run方法
        my1.start();
        my2.start();
//        System.out.println(Thread.currentThread().getName());
//        System.out.println("id:" + Thread.currentThread().getId());
    }
}
