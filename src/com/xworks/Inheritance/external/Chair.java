package com.xworks.Inheritance.external;

public class Chair extends Furniture{
    public Chair() {
        System.out.println("Chair instance created");
    }
    @Override
    public void move(){
        System.out.println("Chair is being moved...");
    }
    @Override
    public void supportWeight(){
        System.out.println("Chair is supporting weight...");
    }
    @Override
    public void adjustHeight(){
        System.out.println("Chair height is being adjusted...");
    }
    @Override
    public void rotate(){
        System.out.println("Chair is rotating...");
    }
    @Override
    public void fold(){
        System.out.println("Chair is being folded...");
    }
}
