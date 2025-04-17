package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.Mechanic;

public class BikeMechanic implements Mechanic {
    public void inspect() {
        System.out.println("Inspecting the bike...");
    }

    public void repair() {
        System.out.println("Repairing the engine...");
    }

    public void testDrive() {
        System.out.println("Test-driving the bike...");
    }
    @Override
    public void greetUser() {
        System.out.println("Welcome!");
    }

}
