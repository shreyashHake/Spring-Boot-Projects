package com.hitachi.annotationAssessment;

import org.springframework.beans.factory.annotation.Autowired;

public class First_Device {
    private Laptop laptop;

    public First_Device() {
    }

    @Autowired
    public First_Device(Laptop laptop) {
        this.laptop = laptop;
        System.out.println("Constructor method called !!");
    }

    public void use() {
        System.out.println("You have " + laptop.getName() + " which has " + laptop.getRam() + " RAM, and runs on " + laptop.getProcessor());
    }
}
