package com.hitachi.model;

public class Circle {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        System.out.println("Setter is being called!");
        this.name = name;
    }
}
