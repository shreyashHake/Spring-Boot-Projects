package hitachi.service;

import hitachi.aspect.Loggable;
import hitachi.model.Circle;
import hitachi.model.Triangle;

public class ShapeService {

    private Triangle triangle;

    private Circle circle;

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }

    public Circle getCircle() {
//        System.out.println("Called via custom annotation via getCircle() method");
        return circle;
    }

    @Loggable
    public void setCircle(Circle circle) {
        this.circle = circle;
    }
}
