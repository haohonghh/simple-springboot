package com.boot.srimplespringboot.thread.mysynchronized.suochongru;

public class MyThread extends Thread {
    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }

}
