package com.xworks.Inheritance.external;

public class SmartWatch extends SmartGadget{
    public SmartWatch() {
        System.out.println("Smartwatch is initialized");
    }

    @Override
    public void trackSteps(){
        System.out.println("Smartwatch is tracking steps...");
    }

    @Override
    public void monitorHeartRate(){
        System.out.println("Smartwatch is monitoring heart rate...");
    }

    @Override
    public void showTime(){
        System.out.println("Smartwatch is displaying time...");
    }

    @Override
    public void receiveNotifications(){
        System.out.println("Smartwatch is receiving notifications...");
    }

    @Override
    public void chargeBattery(){
        System.out.println("Smartwatch is charging battery...");
    }
}
