package com.xworks.Inheritance.external;

public class Pizza extends Food{
    public Pizza(){
        System.out.println("no args const");
    }@Override
    public void bake(){
        System.out.println("Pizza is being baked");
    }
    @Override
    public void addToppings(){
        System.out.println("Adding toppings to Pizza");
    }
    @Override
    public void slice(){
        System.out.println("Slicing the Pizza");
    }
    @Override
    public void serve(){
        System.out.println("Serving the Pizza");
    }
    @Override
    public void eat(){
        System.out.println("Eating the Pizza");
    }
}
