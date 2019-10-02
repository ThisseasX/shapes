package com.example.shapes.impl.polygon;

import com.example.shapes.Shape;

public class Hexagon implements Shape {

    private final double side;

    public Hexagon(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        return side * 6;
    }

    @Override
    public double getArea() {
        return (3 * Math.sqrt(3)) / 2 * Math.pow(side, 2);
    }
}
