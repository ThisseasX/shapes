package com.example.shapes.abstracts;

import com.example.shapes.Shape;

public abstract class AbstractRectangle implements Shape {

    private final double width;
    private final double height;

    protected AbstractRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
