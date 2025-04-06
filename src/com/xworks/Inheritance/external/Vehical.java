package com.xworks.Inheritance.external;

public class Vehical extends Car {
    public Vehical(){
        System.out.println("no args const");
    }
    @Override
    public void startEngine(){
        System.out.println("runner startengine of vehical");
    }
    @Override
    public void stopEngine(){
        System.out.println("runner stopengine of vehical");
    }
    @Override
    public void breakofCar(){
        System.out.println("runner car has braek of vehical");
    }
    @Override
    public void speed(){
        System.out.println("runner the speed of vehical");
    }
    @Override
    public void horn(){
        System.out.println("runnner horn of vehical");
    }
}
