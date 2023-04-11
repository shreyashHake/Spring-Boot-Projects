package com.hitachi.autowiring;

public class Vehicle_default {
    private Car car;

    public Vehicle_default() {

    }

    public Vehicle_default(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void drive() {
        System.out.println("Driving car from default");
    }
}
