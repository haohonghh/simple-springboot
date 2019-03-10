package com.boot.srimplespringboot.thread.mysynchronized.suochongru.demo2;

public class MyThread extends Thread {
    @Override
    public void run() {
        Sub sub = new Sub();
        sub.operateISubMethod();
    }
}
