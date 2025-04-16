package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.PetrolPump;
import com.xworkz.Connection.internal.FuelDispenser;

public class PetrolPumpRunner {
    public static void main(String[] args) {
        FuelDispenser pump = new PetrolPump();
        pump.selectFuelType();
        pump.pumpFuel();
        pump.stopPumping();
    }
}
