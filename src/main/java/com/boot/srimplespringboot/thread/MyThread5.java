package com.boot.srimplespringboot.thread;

public class MyThread5 extends Thread {

    @Override
    public void run() {
        while (true) {
            if (this.isInterrupted()) {
                System.out.println("ֹͣ停止了!");
                return;
            }
            System.out.println("timer=" + System.currentTimeMillis());
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MyThread5 t=new MyThread5();
        t.start();
        Thread.sleep(2000);
        t.interrupt();
    }

}

