package com.xworks.Inheritance.external;

public class Dollar extends Currency{
    public Dollar() {
        System.out.println("No-args constructor Dollar");
    }

    {
        super.exchange();
        System.out.println("Dollar is being exchanged...");
    }

    {
        super.storeValue();
        System.out.println("Dollar stores value efficiently...");
    }

    {
        super.facilitateTrade();
        System.out.println("Dollar facilitates international trade...");
    }

    {
        super.measureValue();
        System.out.println("Dollar measures economic value...");
    }

    {
        super.serveAsUnit();
        System.out.println("Dollar serves as a global unit of account...");
    }
}
