package com.hitachi.autowiring;

public class Car {
    private int horsePower;
    private String color;

    public Car(int horsePower, String color) {
        this.horsePower = horsePower;
        this.color = color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
