package com.example.shapes.impl.square;

import com.example.shapes.Shape;
import com.example.shapes.abstracts.AbstractRectangle;

public class Rectangle extends AbstractRectangle implements Shape {

    public Rectangle(double width, double height) {
        super(width, height);
    }
}
