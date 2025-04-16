package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.WaterHeater;

public class Geyser implements WaterHeater {
    public void turnOn() {
        System.out.println("Geyser turned on.");
    }
    public void heatWater() {
        System.out.println("Water is heating...");
    }
    public void turnOff() {
        System.out.println("Geyser turned off.");
    }


}
