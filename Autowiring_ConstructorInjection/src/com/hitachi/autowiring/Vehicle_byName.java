package com.hitachi.autowiring;

public class Vehicle_byName {
    private Car lambo;
    private Car bugati;
    private Car rolls;

    public Vehicle_byName() {

    }

    public Vehicle_byName(Car lambo, Car bugati, Car rolls) {
        this.lambo = lambo;
        this.bugati = bugati;
        this.rolls = rolls;
    }

    public Car getLambo() {
        return lambo;
    }

    public void setLambo(Car lambo) {
        this.lambo = lambo;
    }

    public Car getBugati() {
        return bugati;
    }

    public void setBugati(Car bugati) {
        this.bugati = bugati;
    }

    public Car getRolls() {
        return rolls;
    }

    public void setRolls(Car rolls) {
        this.rolls = rolls;
    }

    public void drive() {
        System.out.println("Driving Lambo, which has " + lambo.getColor() + " color and " + lambo.getHorsePower() + " horse power.");
        System.out.println("Driving Bugati, which has " + bugati.getColor() + " color and " + bugati.getHorsePower() + " horse power.");
        System.out.println("Driving Rolls, which has " + rolls.getColor() + " color and " + rolls.getHorsePower() + " horse power.");
    }
}
