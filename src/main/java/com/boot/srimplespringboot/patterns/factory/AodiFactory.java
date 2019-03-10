package com.boot.srimplespringboot.patterns.factory;

public class AodiFactory implements CarFactory {

    @Override
    public Car produceCar() {
        return new AodiCar();
    }

    @Override
    public Car produceSaloon() {
        return new AodiSaloon();
    }
}
