package com.xworks.Inheritance.external;

public class NoEdge extends Shape {
    public void cone() {
        System.out.println("no edges in the circle");
    }
    public void radius(Shape shape){
        shape.calculateCircumference();
        shape.resize();
        shape.rotate();
        shape.fillColor();
        shape.calculateArea();

        if(shape instanceof NoEdge){
            NoEdge noEdge=(NoEdge) shape;
            System.out.println("no edge instance of shape");
            noEdge.cone();

        }
    }
}
