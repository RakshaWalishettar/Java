package com.xworks.Inheritance.external;

public class Washingmachine extends Appliance {
    public void  WashingMachine() {
        System.out.println("No-args constructor WashingMachine");
    }

    {
        super.wash();
        System.out.println("WashingMachine is washing...");
    }

    {
        super.rinse();
        System.out.println("WashingMachine is rinsing...");
    }

    {
        super.spin();
        System.out.println("WashingMachine is spinning...");
    }

    {
        super.drain();
        System.out.println("WashingMachine is draining...");
    }

    {
        super.beep();
        System.out.println("WashingMachine is beeping...");
    }
}
