package com.boot.srimplespringboot.thread;

/**
 *
 * @author SnailClimb
 * @date 2018年10月30日
 * @Description: 多个线程之间不共享变量线程安全的情况
 */
public class MyThread3 extends Thread {

    private int count = 5;

    public MyThread3(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        while (count > 0) {
            count--;
            System.out.println("由 " + MyThread.currentThread().getName() + " 计算，count=" + count);
        }
    }

    public static void main(String[] args) {
        MyThread3 a = new MyThread3("A");
        MyThread3 b = new MyThread3("B");
        MyThread3 c = new MyThread3("C");
        a.start();
        b.start();
        c.start();
    }
}

