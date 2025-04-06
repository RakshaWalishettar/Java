package com.xworks.Inheritance.external;

public class LED extends LightSouce{
    public LED() {
        System.out.println("No-args constructor LED");
    }
    @Override
    public void turnOn(){
        System.out.println("LED is turned on.");
    }
    @Override
    public void turnOff(){
        System.out.println("LED is turned off.");
    }
    @Override
    public void adjustBrightness(){
        System.out.println("LED brightness adjusted.");
    }
    @Override
    public void emitLight(){
        System.out.println("LED emitting light...");
    }
    @Override
    public void consumeEnergy(){
        System.out.println("LED consume energy");
    }
}
