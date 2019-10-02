package com.example;

import com.example.shapes.Shape;
import com.example.shapes.impl.polygon.Hexagon;
import com.example.shapes.impl.square.Rectangle;
import com.example.shapes.impl.square.Square;
import com.example.shapes.impl.triangle.EquilateralTriangle;
import com.example.shapes.impl.triangle.IsoscelesTriangle;
import com.example.shapes.impl.triangle.ScaleneTriangle;

class Main {

    public static void main(String[] args) {
        Shape r = new Rectangle(30, 10);
        System.out.println("Rectangle");
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        System.out.println();

        Shape s = new Square(30);
        System.out.println("Square");
        System.out.println(s.getArea());
        System.out.println(s.getPerimeter());
        System.out.println();

        Shape et = new EquilateralTriangle(20);
        System.out.println("EquilateralTriangle");
        System.out.println(et.getArea());
        System.out.println(et.getPerimeter());
        System.out.println();

        Shape it = new IsoscelesTriangle(20, 10);
        System.out.println("IsoscelesTriangle");
        System.out.println(it.getArea());
        System.out.println(it.getPerimeter());
        System.out.println();

        Shape st = new ScaleneTriangle(23, 25, 18);
        System.out.println("ScaleneTriangle");
        System.out.println(st.getArea());
        System.out.println(st.getPerimeter());
        System.out.println();

        Shape h = new Hexagon(7);
        System.out.println("Hexagon");
        System.out.println(h.getArea());
        System.out.println(h.getPerimeter());
        System.out.println();
    }
}
