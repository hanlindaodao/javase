package com.producerAndCustomer_v2;

public class Resource {
    private int thingsNum = 0;
    private int surplus = 0;

    public synchronized void add(int thingsNum) {
        if (surplus < 5) {          // 箱子最多装五件商品
            surplus++;
            System.out.println(Thread.currentThread().getName()
                    + "正在生产第" + thingsNum + "件商品;" +
                    "此时箱子里有" + surplus + "件商品.");
            this.thingsNum = thingsNum;
            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void sub() {
//        if (surplus <= 0) {
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
        if (surplus > 0) {
            surplus--;
            System.out.println((Thread.currentThread().getName()
                    + "正在取出第" + (thingsNum - surplus) + "件商品;" +
                    "此时箱子里有" + surplus + "件商品."));
            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


/*
// 会出现剩余-1的情况
public synchronized void add(int thingsNum) {
        if (surplus >= 5) {          // 箱子最多装五件商品
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        surplus++;
        System.out.println(Thread.currentThread().getName()
                + "正在生产第" + thingsNum + "件商品;" +
                "此时箱子里有" + surplus + "件商品.");
        this.thingsNum = thingsNum;
        notify();
    }

    public synchronized void sub() {
        if (surplus <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        surplus--;
        System.out.println((Thread.currentThread().getName()
                + "正在取出第" + (thingsNum - surplus) + "件商品;" +
                "此时箱子里有" + surplus + "件商品."));
        notify();
    }
 */