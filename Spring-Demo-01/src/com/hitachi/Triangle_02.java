package com.hitachi;

// member variable initialization using constructor injection
public class Triangle_02 {
    private String type;
    private int height;

    public Triangle_02(String type) {
        this.type = type;
    }

    public Triangle_02(int height) {
        this.height = height;
    }

    public Triangle_02(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public int getHeight() {
        return height;
    }

    public void draw() {
        System.out.println(getType() + " Triangle drawn");
    }

    public void getDetails() {
        System.out.println(getType() + " triangle drawn, with height " + getHeight());
    }
}
