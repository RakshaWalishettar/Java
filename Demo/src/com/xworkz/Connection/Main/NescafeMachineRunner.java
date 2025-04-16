package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.NescafeMachine;
import com.xworkz.Connection.internal.CoffeeMachine;

public class NescafeMachineRunner {
    public static void main(String[] args) {
        CoffeeMachine machine = new NescafeMachine();
        machine.brewCoffee();
        machine.addMilk();
        machine.serve();
    }
}
