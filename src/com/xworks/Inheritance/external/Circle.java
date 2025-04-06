package com.xworks.Inheritance.external;

public class Circle extends Shape{
    public void circle() {
        System.out.println("the circle is the shape");
    }@Override
    public void calculateArea(){
        System.out.println("Circle Area " );
    }@Override
    public void calculateCircumference(){
        System.out.println("Circle Circumference ");
    }@Override
    public void rotate(){
        System.out.println("Rotating circle...");
    }@Override
    public void resize(){
        System.out.println("Resizing circle...");
    }@Override
    public void fillColor(){
        System.out.println("Filling circle with color...");
    }
}
