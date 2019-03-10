package com.boot.srimplespringboot.patterns.factory;

public class Test {

    public static void main(String[] args) {

        CarFactory buyBwm = new BwmFactory();
        buyBwm.produceCar().run();
        buyBwm.produceSaloon().run();

        CarFactory buyAodi = new AodiFactory();
        buyAodi.produceCar().run();
        buyAodi.produceSaloon().run();
    }
}
