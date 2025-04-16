package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.FuelDispenser;

public class PetrolPump implements FuelDispenser {
    public void selectFuelType() {
        System.out.println("Petrol selected.");
    }

    public void pumpFuel() {
        System.out.println("Fuel is being pumped...");
    }

    public void stopPumping() {
        System.out.println("Pumping stopped.");
    }

}
