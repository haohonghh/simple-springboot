package com.boot.srimplespringboot.patterns.single;

import lombok.Synchronized;

public class Singleten1 {
    private Singleten1() {

    }

    private static volatile Singleten1 singleten = null;

    public static Singleten1 getInstance() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (singleten == null) {
            synchronized (Singleten1.class) {
                if (singleten == null) {
                    singleten = new Singleten1();
                }

            }
        }
        return singleten;
    }
}
