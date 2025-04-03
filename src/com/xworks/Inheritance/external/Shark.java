package com.xworks.Inheritance.external;

public class Shark extends Fish{
    public Shark() {
        System.out.println("No-args constructor: Shark");
    }

    {
        super.swim();
        System.out.println("Shark is swimming fast...");
    }

    {
        super.hunt();
        System.out.println("Shark is hunting prey...");
    }

    {
        super.eat();
        System.out.println("Shark is eating aggressively...");
    }

    {
        super.sleep();
        System.out.println("Shark is resting...");
    }

    {
        super.breatheUnderwater();
        System.out.println("Shark breathes through gills...");
    }
}
