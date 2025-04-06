package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Car;
import com.xworks.Inheritance.external.Vehical;

public class Vehicalrunner {
    public static void main (String[] args){
        Vehical vehical=new Vehical();
        vehical.stopEngine();
        vehical.startEngine();
        vehical.speed();
        vehical.breakofCar();
        vehical.horn();

        System.out.println("========================");
        Car car=new Car();
        car.startEngine();
        car.stopEngine();
        car.speed();
        car.breakofCar();
        car.horn();
    }

}
