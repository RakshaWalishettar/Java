package com.xworkz.inheritance.external;

public class Vehical extends Car {
    public void vehical()
    {
        super.startEngine();
        System.out.println("runner startengine of vehical");
    }
    {
        super.stopEngine();
        System.out.println("runner stopengine of vehical");
    }
    {
        super.breakofCar();
        System.out.println("runner car has braek of vehical");
    }
    {
        super.speed();
        System.out.println("runner the speed of vehical");
    }
    {
        super.horn();
        System.out.println("runnner horn of vehical");
    }
}
