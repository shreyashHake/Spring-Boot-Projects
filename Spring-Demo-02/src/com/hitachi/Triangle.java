package com.hitachi;

public class Triangle {
    private Point pointA;

    public Triangle(){}

    public Triangle(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public void draw(){
        System.out.println("Drawing the traingle with point : [" + pointA.getX() + "," + pointA.getY() + "]");
    }
}
