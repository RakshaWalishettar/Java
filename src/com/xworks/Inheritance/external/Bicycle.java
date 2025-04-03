package com.xworks.Inheritance.external;

public class Bicycle extends RoadVehical{
    public void Bicycle() {
        System.out.println("Bicycle object created.");
    }

    {
        super.move();
        System.out.println("Bicycle is pedaling...");
    }

    {
        super.stop();
        System.out.println("Bicycle is applying brakes...");
    }

    {
        super.maintain();
        System.out.println("Bicycle is being repaired...");
    }

    {
        super.load();
        System.out.println("Bicycle is carrying small loads...");
    }

    {
        super.fuel();
        System.out.println("Bicycle does not require fuel!");
    }

}
