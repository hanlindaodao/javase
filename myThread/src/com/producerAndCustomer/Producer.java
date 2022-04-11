package com.producerAndCustomer;

public class Producer implements Runnable{
    Resource r;

    public Producer(Resource r) {
        this.r = r;
    }

    @Override
    public void run() {
        System.out.println("生产者开始生产……");
        for (int i = 1; i <= 20; i++) {
            r.add(i);
        }
    }
}
