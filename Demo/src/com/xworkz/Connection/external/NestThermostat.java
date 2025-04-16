package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.Thermostat;

public class NestThermostat implements Thermostat {
    public void increaseTemperature() {
        System.out.println("Increasing temperature on Nest.");
    }

    public void decreaseTemperature() {
        System.out.println("Decreasing temperature on Nest.");
    }

    public void displayTemperature() {
        System.out.println("Displaying current temperature on Nest.");
    }

}
