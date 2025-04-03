package com.xworks.Inheritance.external;

public class Router extends NetworkDevice{
    public Router() {
        System.out.println("Router is initialized.");
    }

    {
        super.powerOn();
        System.out.println("Router is powering on...");
    }

    {
        super.connect();
        System.out.println("Router is connecting to the internet...");
    }

    {
        super.disconnect();
        System.out.println("Router is disconnecting from the internet...");
    }

    {
        super.reset();
        System.out.println("Router is performing a factory reset...");
    }

    {
        super.powerOff();
        System.out.println("Router is shutting down...");
    }
}
