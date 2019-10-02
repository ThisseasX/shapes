package com.example.shapes.impl.triangle;

import com.example.shapes.Shape;
import com.example.shapes.abstracts.AbstractTriangle;

public class IsoscelesTriangle extends AbstractTriangle implements Shape {

    public IsoscelesTriangle(double equalSide, double oddSide) {
        super(equalSide, equalSide, oddSide);
    }
}
