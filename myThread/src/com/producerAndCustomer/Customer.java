package com.producerAndCustomer;

public class Customer implements Runnable{
    private Resource r;

    public Customer(Resource r) {
        this.r = r;
    }

    @Override
    public void run() {
        while (true) {
            r.sub();
        }
    }
}
