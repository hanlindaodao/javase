package com.daodao09;

public class SellTicket implements Runnable {
//    private int tickets = 100;
    private static int tickets = 100;
    private Object obj = new Object();
    private int x = 0;

    @Override
    public void run() {
        while (true) {
            if (x % 2 == 0) {
//                synchronized (obj) {
//                synchronized (this) {
                synchronized (SellTicket.class) {
                    if (tickets > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                        tickets--;
                    }
                }
            } else {
//                synchronized (obj) {
//                    if (tickets > 0) {
//                        try {
//                            Thread.sleep(100);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
//                        tickets--;
//                    }
//                }
                sellTicket();
            }
            x++;
        }
    }

//    private void sellTicket() {
//        synchronized (obj) {
//            if (tickets > 0) {
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
//                tickets--;
//            }
//        }
//    }

//    private synchronized void sellTicket() {
//        if (tickets > 0) {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
//            tickets--;
//        }
//    }


    /**
     * 同步方法分两种，一种是同步方法，一种是同步静态方法
     * 1.同步方法：
     *      把synchronized关键字加到方法上
     *      格式：
     *          修饰符 synchronized 返回值类型 方法名(方法参数) {}
     *
     *      锁 ---> this
     *
     * 2.同步静态方法：
     *      把synchronized关键字加到静态方法上
     *      格式：
     *          修饰符 static synchronized 返回值类型 方法名(方法参数){}
     *
     *      锁 ---> 类名.class
     */
    private static synchronized void sellTicket() {
        if (tickets > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
            tickets--;
        }
    }
}
