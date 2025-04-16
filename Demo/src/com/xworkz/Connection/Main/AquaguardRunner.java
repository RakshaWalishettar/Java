package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.Aquaguard;
import com.xworkz.Connection.internal.WaterDispenser;

public class AquaguardRunner {
    public static void main(String[] args) {
        WaterDispenser dispenser = new Aquaguard();
        dispenser.dispenseHotWater();
        dispenser.dispenseColdWater();
        dispenser.stopDispensing();
    }
}
