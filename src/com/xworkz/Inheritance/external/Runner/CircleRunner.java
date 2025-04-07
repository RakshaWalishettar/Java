package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Circle;
import com.xworks.Inheritance.external.NoEdge;
import com.xworks.Inheritance.external.Shape;

public class CircleRunner {
    public static void main(String[] args){
        Shape shape=new Shape();
        shape.rotate();
        shape.resize();
        shape.fillColor();
        shape.calculateArea();
        shape.calculateCircumference();

        System.out.println("==================================");
        Circle circle=new Circle();
        circle.rotate();
        circle.fillColor();
        circle.resize();
        circle.calculateArea();
        circle.calculateCircumference();

        System.out.println("==================================");
        NoEdge noEdge=new NoEdge();
        noEdge.radius(shape);
        noEdge.radius(noEdge);
    }

}
