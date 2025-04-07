package com.xworks.Inheritance.external;

public class Helicopter extends Aircraft{
    public Helicopter() {
        System.out.println("No-args constructor Helicopter");
    }
    @Override
    public void fly(){
        System.out.println("Helicopter is flying...");
    }
    @Override
    public void land(){
        System.out.println("Helicopter is landing...");
    }
    @Override
    public void refuel(){
        System.out.println("Helicopter is refueling...");
    }
    @Override
    public void hover(){
        System.out.println("Helicopter is hovering...");
    }
    @Override
    public void loadPassengers(){
        System.out.println("Helicopter is loading passengers...");
    }
    public void limitseat(){
        System.out.println("the runner limitseat");
    }
}
