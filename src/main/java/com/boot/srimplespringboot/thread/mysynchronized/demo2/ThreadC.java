package com.boot.srimplespringboot.thread.mysynchronized.demo2;

public class ThreadC extends Thread {
    private Service service;
    public ThreadC(Service service) {
        super();
        this.service = service;
    }
    @Override
    public void run() {
        service.printC();
    }
}
