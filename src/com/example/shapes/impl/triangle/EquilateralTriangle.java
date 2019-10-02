package com.example.shapes.impl.triangle;

import com.example.shapes.Shape;
import com.example.shapes.abstracts.AbstractTriangle;

public class EquilateralTriangle extends AbstractTriangle implements Shape {

    public EquilateralTriangle(double side) {
        super(side, side, side);
    }
}
