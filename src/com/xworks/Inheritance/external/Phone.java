package com.xworks.Inheritance.external;

public class Phone extends Gadget {
   public Phone() {
        System.out.println("no-args const phone");
    }
    @Override
    public void turnOn(){
        System.out.println("Phone is booting up...");
    }
    @Override
    public void turnOff(){
        System.out.println("Phone is shutting down...");
    }
    @Override
    public void charge(){
        System.out.println("Phone is charging...");
    }
    @Override
    public void connectToWiFi(){
        System.out.println("Phone is now connected to the internet.");
    }
    @Override
    public void updateSoftware(){
        System.out.println("Phone software is up-to-date.");
    }
}

