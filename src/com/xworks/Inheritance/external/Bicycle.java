package com.xworks.Inheritance.external;

public class Bicycle extends RoadVehical{
    public Bicycle() {
        System.out.println("Bicycle object created.");
    }
    @Override
    public void move(){
        System.out.println("Bicycle is pedaling...");
    }
    @Override
    public void stop(){
        System.out.println("Bicycle is applying brakes...");
    }
    @Override
    public void maintain(){
        System.out.println("Bicycle is being repaired...");
    }
    @Override
    public void load(){
        System.out.println("Bicycle is carrying small loads...");
    }
    @Override
    public void fuel(){
        System.out.println("Bicycle does not require fuel!");
    }
    public void peddel(){
        System.out.println("has the peddel");
    }

}
