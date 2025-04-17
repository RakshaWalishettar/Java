package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.ConstructionMachine;

public class Bulldozer implements ConstructionMachine {
    public void start() {
        System.out.println("Bulldozer started.");
    }

    public void operate() {
        System.out.println("Bulldozer operating.");
    }

    public void shutdown() {
        System.out.println("Bulldozer shutdown.");
    }
    @Override
    public void greetOperator() {
        System.out.println("Welcome, operator. Ready to begin construction.");
    }
}
