package com.xworkz.Connection.Main.Connection.external;

import com.xworkz.Connection.internal.Vehicle;

public class Car implements Vehicle {
    public void startEngine() {
        System.out.println("Car engine started.");
    }

    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }

    public void accelerate() {
        System.out.println("Car is accelerating.");
    }
}
