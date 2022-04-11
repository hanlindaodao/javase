package com.producerAndCustomer_v2;

public class Customer extends Thread{
    private Resource r;

    public Customer(Resource r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            r.sub();
        }
    }
}
