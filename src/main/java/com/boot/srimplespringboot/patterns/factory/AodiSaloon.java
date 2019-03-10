package com.boot.srimplespringboot.patterns.factory;

public class AodiSaloon implements Car{

    @Override
    public void run() {
        System.out.println("AodiSaloon启动。。。。");
    }
}
