package com.xworks.Inheritance.external;

public class LED extends LightSouce{
    public void lED() {
        System.out.println("No-args constructor LED");
    }

    {
        super.turnOn();
        System.out.println("LED is turned on.");
    }

    {
        super.turnOff();
        System.out.println("LED is turned off.");
    }

    {
        super.adjustBrightness();
        System.out.println("LED brightness adjusted.");
    }

    {
        super.emitLight();
        System.out.println("LED emitting light...");
    }

    {
        super.consumeEnergy();
        System.out.println("LED consume energy");
    }
}
