package com.xworks.Inheritance.external;

public class SmartWatch extends SmartGadget{
    public void Smartwatch() {
        System.out.println("Smartwatch is initialized");
    }

    {
        super.trackSteps();
        System.out.println("Smartwatch is tracking steps...");
    }

    {
        super.monitorHeartRate();
        System.out.println("Smartwatch is monitoring heart rate...");
    }

    {
        super.showTime();
        System.out.println("Smartwatch is displaying time...");
    }

    {
        super.receiveNotifications();
        System.out.println("Smartwatch is receiving notifications...");
    }

    {
        super.chargeBattery();
        System.out.println("Smartwatch is charging battery...");
    }
}
