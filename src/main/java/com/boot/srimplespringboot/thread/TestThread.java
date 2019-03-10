package com.boot.srimplespringboot.thread;

public class TestThread {

    public static void main(String[] args) {
     //   MyThread thread = new MyThread();
      //  thread.start();
        Runnable runnable = new MyThread2();
        Thread thread = new Thread(runnable);
        thread.start();
    }

}
