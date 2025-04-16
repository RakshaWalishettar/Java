package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.NestThermostat;
import com.xworkz.Connection.internal.Thermostat;

public class NestThermostatRunner {
    public static void main(String[] args) {
        Thermostat thermostat = new NestThermostat();
        thermostat.increaseTemperature();
        thermostat.decreaseTemperature();
        thermostat.displayTemperature();
    }
}
