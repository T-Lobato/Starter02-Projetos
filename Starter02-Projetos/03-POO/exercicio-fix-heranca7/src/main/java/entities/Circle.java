package entities;

import entities.enums.Color;

public class Circle extends Shape{
    public final Double PI = 3.14156;

    private Double radius;

    public Circle(){
    }

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * Math.pow(radius, 2);
    }
}
