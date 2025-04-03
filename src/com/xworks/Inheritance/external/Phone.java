package com.xworks.Inheritance.external;

public class Phone extends Gadget {
   public void phone() {
        System.out.println("no-args const phone");
    }

    {
        super.turnOn();
        System.out.println("Phone is booting up...");
    }

    {
        super.turnOff();
        System.out.println("Phone is shutting down...");
    }

    {
        super.charge();
        System.out.println("Phone is charging...");
    }

    {
        super.connectToWiFi();
        System.out.println("Phone is now connected to the internet.");
    }

    {
        super.updateSoftware();
        System.out.println("Phone software is up-to-date.");
    }
}

