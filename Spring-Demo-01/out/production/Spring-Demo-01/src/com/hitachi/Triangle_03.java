package com.hitachi;

// Object injection
public class Triangle_03 {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle_03() {

    }

    public Triangle_03(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void draw() {
        System.out.println("Co-ordinates of constructor are : ");
        System.out.println("PointA: (" + pointA.getX() + "," + pointA.getY() + ")");
        System.out.println("PointB: (" + pointB.getX() + "," + pointB.getY() + ")");
        System.out.println("PointC: (" + pointC.getX() + "," + pointC.getY() + ")");
    }
}
