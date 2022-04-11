package com.producerAndCustomer_v2;

public class Demo {
    public static void main(String[] args) {
        Resource r = new Resource();

        Producer p1 = new Producer(r);
        p1.setName("生产者1");
        Producer p2 = new Producer(r);
        p2.setName("生产者2");

        Customer c1 = new Customer(r);
        c1.setName("消费者1");
        Customer c2 = new Customer(r);
        c2.setName("消费者2");

        p1.start();
        p2.start();
        c1.start();
        c2.start();
    }
}
