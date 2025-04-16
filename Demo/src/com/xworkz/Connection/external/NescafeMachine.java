package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.CoffeeMachine;

public class NescafeMachine implements CoffeeMachine {
    public void brewCoffee() {
        System.out.println("Brewing coffee in Nescafe Machine.");
    }

    public void addMilk() {
        System.out.println("Adding milk in Nescafe Machine.");
    }

    public void serve() {
        System.out.println("Serving coffee from Nescafe Machine.");
    }

}
