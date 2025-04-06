package com.xworks.Inheritance.external;

public class Shark extends Fish{
    public Shark() {
        System.out.println("No-args constructor: Shark");
    }

    @Override
    public void swim(){
        System.out.println("Shark is swimming fast...");
    }

    @Override
    public void hunt(){
        System.out.println("Shark is hunting prey...");
    }
    @Override
    public void eat(){
        System.out.println("Shark is eating aggressively...");
    }

    @Override
    public void sleep(){
        System.out.println("Shark is resting...");
    }

    @Override
    public void breatheUnderwater(){
        System.out.println("Shark breathes through gills...");
    }
}
