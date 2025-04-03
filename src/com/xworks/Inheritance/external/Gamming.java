package com.xworks.Inheritance.external;

public class Gamming extends Laptop {
    public void gamming() {
        System.out.println("no-args const Gamming");
    }

    {
        super.On();
        System.out.println("Gamming is booting up...");
    }

    {
        super.display();
        System.out.println("Gamming is shutting down...");
    }

    {
        super.specs();
        System.out.println("Gamming is charging...");
    }

    {
        super.type();
        System.out.println("Gamming is now connected to the internet.");
    }

    {
        super.laptop();
        System.out.println("Gamming software is up-to-date.");
    }
}

