package com.hitachi.inheritance;

import com.hitachi.Point;

import java.util.List;

public class Triangle {
    private List<Point> points;

    public List<Point> getPointA() {
        return points;
    }

    public void setPointA(List<Point> points) {
        this.points = points;
    }


    public void draw() {
        System.out.println("Co-ordinates of constructor are : ");
        for (Point point: points) {
            System.out.println("Point: (" + point.getX() + "," + point.getY() + ")");
        }
    }
}
