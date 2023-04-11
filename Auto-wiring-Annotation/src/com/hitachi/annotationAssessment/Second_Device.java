package com.hitachi.annotationAssessment;

import org.springframework.beans.factory.annotation.Autowired;

public class Second_Device {
    private Laptop laptop;

    public Second_Device() {
    }

    @Autowired
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
        System.out.println("Setter method called !!");
    }

    public void use() {
        System.out.println("You have " + laptop.getName() + " which has " + laptop.getRam() + " RAM, and runs on " + laptop.getProcessor());
    }
}
