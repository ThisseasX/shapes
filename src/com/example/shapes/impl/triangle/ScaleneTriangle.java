package com.example.shapes.impl.triangle;

import com.example.shapes.Shape;
import com.example.shapes.abstracts.AbstractTriangle;

public class ScaleneTriangle extends AbstractTriangle implements Shape {

    public ScaleneTriangle(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }
}
