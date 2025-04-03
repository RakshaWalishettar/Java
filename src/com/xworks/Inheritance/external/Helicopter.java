package com.xworks.Inheritance.external;

public class Helicopter extends Aircraft{
    public void helicopter() {
        System.out.println("No-args constructor Helicopter");
    }

    {
        super.fly();
        System.out.println("Helicopter is flying...");
    }

    {
        super.land();
        System.out.println("Helicopter is landing...");
    }

    {
        super.refuel();
        System.out.println("Helicopter is refueling...");
    }

    {
        super.hover();
        System.out.println("Helicopter is hovering...");
    }

    {
        super.loadPassengers();
        System.out.println("Helicopter is loading passengers...");
    }
}
