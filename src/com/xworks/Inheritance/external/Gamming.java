package com.xworks.Inheritance.external;

public class Gamming extends Laptop {
    public Gamming() {
        System.out.println("no-args const Gamming");
    }
    @Override
    public void On(){
        System.out.println("Gamming is booting up...");
    }
    @Override
    public void display(){
        System.out.println("Gamming is shutting down...");
    }
    @Override
    public void specs(){
        System.out.println("Gamming is charging...");
    }
    @Override
    public void type(){
        System.out.println("Gamming is now connected to the internet.");
    }
    @Override
    public void laptop(){
        System.out.println("Gamming software is up-to-date.");
    }
}

