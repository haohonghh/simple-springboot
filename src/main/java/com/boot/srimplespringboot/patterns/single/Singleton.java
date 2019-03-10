package com.boot.srimplespringboot.patterns.single;

/**
 * 饿汉式
 */
public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getSignleton() {
        return singleton;
    }
}