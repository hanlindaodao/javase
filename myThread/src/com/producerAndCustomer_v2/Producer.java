package com.producerAndCustomer_v2;

public class Producer extends Thread{
    private Resource r;

    public Producer(Resource r) {
        this.r = r;
    }

    @Override
    public void run() {
        for (int i = 1; i < 20; i++) {
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            r.add(i);
        }
    }
}
