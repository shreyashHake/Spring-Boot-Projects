package com.hitachi.annotationAssessment;

public class Laptop {
    private String name;
    private int ram;

    private String processor;

    public Laptop() {
    }

    public Laptop(String name, int ram, String processor) {
        this.name = name;
        this.ram = ram;
        this.processor = processor;
    }

    public String getName() {
        return name;
    }

    public int getRam() {
        return ram;
    }

    public String getProcessor() {
        return processor;
    }
}
