package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.WaterDispenser;

public class Aquaguard implements WaterDispenser {
    public void dispenseHotWater() {
        System.out.println("Dispensing hot water from Aquaguard.");
    }

    public void dispenseColdWater() {
        System.out.println("Dispensing cold water from Aquaguard.");
    }

    public void stopDispensing() {
        System.out.println("Stopped dispensing from Aquaguard.");
    }
    @Override
    public void greetUser() {
        System.out.println("Welcome! .");
    }
}
