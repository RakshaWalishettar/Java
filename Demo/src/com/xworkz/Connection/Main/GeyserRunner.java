package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.Geyser;
import com.xworkz.Connection.internal.WaterHeater;

public class GeyserRunner {
    public static void main(String[] args) {
        WaterHeater geyser = new Geyser();
        geyser.turnOn();
        geyser.heatWater();
        geyser.turnOff();
        geyser.hot();
    }
}
