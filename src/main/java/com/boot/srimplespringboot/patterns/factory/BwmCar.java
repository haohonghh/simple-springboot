package com.boot.srimplespringboot.patterns.factory;

public class BwmCar implements Car {
    @Override
    public void run() {
        System.out.println("bwm启动。。。。。");
    }
}
