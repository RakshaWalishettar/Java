package com.xworkz.Multilevelinheritance.internal;

public class Vehicle {
    void fuelUp() {
        System.out.println("Filling up fuel");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is being driven");
    }
}

class ElectricCar extends Car {
    void chargeBattery() {
        System.out.println("Charging the electric car battery");
    }

    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();
        ec.fuelUp();
        ec.drive();
        ec.chargeBattery();
    }
}
