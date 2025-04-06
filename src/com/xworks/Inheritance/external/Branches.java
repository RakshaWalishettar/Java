package com.xworks.Inheritance.external;

public class Branches extends Tree{
    public Branches() {
        System.out.println("Branches are part of the tree.");
    }
    @Override
    public  void growLeaves(){
        System.out.println("Branches help grow leaves.");
    }
    @Override
    public void provideShade(){
        System.out.println("Branches contribute to shade.");
    }
    @Override
    public void bearFruit(){
        System.out.println("Branches hold and support fruit.");
    }
    @Override
    public void absorbCO2(){
        System.out.println("Branches help in CO2 absorption.");
    }
    @Override
    public void supportWildlife(){
        System.out.println("Branches provide shelter for wildlife.");
    }
}
