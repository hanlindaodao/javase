package com.producerAndCustomer;

public class Demo {
    public static void main(String[] args) {
        Resource r = new Resource();

        Producer p = new Producer(r);
        Customer c = new Customer(r);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);

        t1.start();
        t2.start();
    }
}
