package com.boot.srimplespringboot.patterns.factory;

public class BwmSaloon implements Car {
    @Override
    public void run() {
        System.out.println("BwmSaloon启动。。。。");
    }
}
