package com.xworks.Inheritance.external;

public class Flower extends Plant{
    public Flower() {
        System.out.println("no-args const Flower");
    }
    @Override
    public void grow(){
        System.out.println("Flower is growing...");
    }
    @Override
    public void photosynthesize(){
        System.out.println("Flower is photosynthesizing...");
    }
    @Override
    public void absorbWater(){
        System.out.println("Flower is absorbing water...");
    }
    @Override
    public void releaseOxygen(){
        System.out.println("Flower is releasing oxygen...");
    }
    @Override
    public void bloom(){
        System.out.println("Flower is blooming...");
    }
    public void petals(){
        System.out.println("runner of the petals");
    }
}
