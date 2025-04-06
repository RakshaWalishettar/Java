package com.xworks.Inheritance.external;

public class Juice extends Fruit{
    public Juice(){
        System.out.println("no arg const of juice");
    }@Override
    public void extract(){
        System.out.println("Juice extraction completed.");
    }
    @Override
    public void blend(){
        System.out.println("Juice is blended smoothly.");
    }
    @Override
    public void serveCold(){
        System.out.println("Juice is served cold.");
    }
    @Override
    public void addIce(){
        System.out.println("Juice with ice is ready.");
    }
    @Override
    public void drink(){
        System.out.println("Enjoy your fresh juice!");
    }
}
