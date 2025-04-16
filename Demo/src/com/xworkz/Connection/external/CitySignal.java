package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.TrafficSignal;

public class CitySignal implements TrafficSignal {
    public void showRed() {
        System.out.println("Traffic light is Red.");
    }

    public void showYellow() {
        System.out.println("Traffic light is Yellow.");
    }

    public void showGreen() {
        System.out.println("Traffic light is Green.");
    }

}
