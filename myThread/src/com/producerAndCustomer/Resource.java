package com.producerAndCustomer;

public class Resource {
    private int milk = 0;
    private boolean stage = false;

    public synchronized void add(int milk) {
        if (stage) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milk = milk;
        System.out.println("生产者生产第" + this.milk + "瓶牛奶");
        stage = true;
        notifyAll();
    }

    public synchronized void sub(){
        if (!stage) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费者拿走第" + this.milk + "瓶牛奶");
        stage = false;
        notifyAll();
    }
}
