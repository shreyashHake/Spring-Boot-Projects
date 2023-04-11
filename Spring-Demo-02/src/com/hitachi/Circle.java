package com.hitachi;

import org.springframework.beans.factory.annotation.Required;

public class Circle {
    private Point center;

    public Point getCenter() {
        return center;
    }

    @Required
    public void setCenter(Point center) {
        this.center = center;
    }

    public void draw() {
        System.out.println("Drawing the circle with the center at : [" + center.getX() + "," + center.getY() + "]");
    }
}
