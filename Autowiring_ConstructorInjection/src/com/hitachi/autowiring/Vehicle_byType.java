package com.hitachi.autowiring;

public class Vehicle_byType {
    private Car bmw;

    public Vehicle_byType(){

    }

    public Vehicle_byType(Car bmw) {
        this.bmw = bmw;
    }

    public Car getBmw() {
        return bmw;
    }

    public void setBmw(Car bmw) {
        this.bmw = bmw;
    }

    public void drive() {
        System.out.println("Driving Lambo, which has " + bmw.getColor() + " color and " + bmw.getHorsePower() + " horse power.");
    }
}
