package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.Drone;

public class DJIPhantom implements Drone {
    public void takeOff() {
        System.out.println("DJI Phantom taking off.");
    }

    public void fly() {
        System.out.println("DJI Phantom flying.");
    }

    public void land() {
        System.out.println("DJI Phantom landing.");
    }
    @Override
    public void battery() {
        System.out.println("Welcome, how  can i help.");
    }

}
