package com.example.shapes.impl.square;

import com.example.shapes.Shape;
import com.example.shapes.abstracts.AbstractRectangle;

public class Square extends AbstractRectangle implements Shape {

    public Square(double side) {
        super(side, side);
    }
}
