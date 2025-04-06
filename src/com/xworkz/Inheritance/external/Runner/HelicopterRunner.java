package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Aircraft;
import com.xworks.Inheritance.external.Helicopter;

public class HelicopterRunner {
    public static void main(String[] args) {
        Helicopter helicopter = new Helicopter();
        helicopter.fly();
        helicopter.land();
        helicopter.hover();
        helicopter.refuel();
        helicopter.loadPassengers();

        System.out.println("==============================");
        Aircraft aircraft = new Aircraft();
        aircraft.fly();
        aircraft.land();
        aircraft.hover();
        aircraft.loadPassengers();
        aircraft.refuel();
    }
}
