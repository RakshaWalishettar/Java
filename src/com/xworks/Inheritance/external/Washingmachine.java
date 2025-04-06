package com.xworks.Inheritance.external;

public class Washingmachine extends Appliance {
    public Washingmachine() {
        System.out.println("No-args constructor WashingMachine");
    }

    @Override
    public void wash(){
        System.out.println("WashingMachine is washing...");
    }

    @Override
    public void rinse(){
        System.out.println("WashingMachine is rinsing...");
    }

    @Override
    public void spin(){
        System.out.println("WashingMachine is spinning...");
    }

    @Override
    public void drain(){
        System.out.println("WashingMachine is draining...");
    }

    @Override
    public void beep(){
        System.out.println("WashingMachine is beeping...");
    }
}
