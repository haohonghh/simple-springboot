package com.boot.srimplespringboot.patterns.single;

public class Test {


    public static void main(String[] args) {

        new Thread(){
            @Override
            public void run() {
                System.out.println(Singleton.getSignleton());
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                System.out.println(Singleton.getSignleton());
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                System.out.println(Singleton.getSignleton());
            }
        }.start();


    }
}
