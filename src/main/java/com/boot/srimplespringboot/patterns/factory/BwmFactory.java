package com.boot.srimplespringboot.patterns.factory;

public class BwmFactory implements CarFactory{

    @Override
    public Car produceCar() {
        return new BwmCar();
    }

    @Override
    public Car produceSaloon() {
        return new BwmSaloon();
    }


}
