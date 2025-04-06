package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.LED;
import com.xworks.Inheritance.external.LightSouce;

public class LEDRunner {
    public static void main(String[] args) {
        LED led = new LED();
        led.turnOff();
        led.emitLight();
        led.consumeEnergy();
        led.adjustBrightness();
        led.turnOn();

        System.out.println("======================================");
        LightSouce lightSource = new LightSouce();
        lightSource.turnOn();
        lightSource.turnOff();
        lightSource.emitLight();
        lightSource.adjustBrightness();
        lightSource.consumeEnergy();
    }
}
