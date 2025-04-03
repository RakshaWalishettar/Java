package com.xworks.Inheritance.external;

public class Circle extends Shape{
    public void Circle() {
        System.out.println("the circle is the shape");
    }
    {
        super.calculateArea();
        System.out.println("Circle Area " );
    }
    {
        super.calculateCircumference();
        System.out.println("Circle Circumference ");
    }
    {
        super.rotate();
        System.out.println("Rotating circle...");
    }
    {
        super.resize();
        System.out.println("Resizing circle...");
    }
    {
        super.fillColor();
        System.out.println("Filling circle with color...");
    }
}
