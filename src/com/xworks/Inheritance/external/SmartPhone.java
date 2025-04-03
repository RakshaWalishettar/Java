package com.xworks.Inheritance.external;

public class SmartPhone extends Mobile{
    public void smartPhone() {
        System.out.println("no-args const SmartPhone");
    }

    {
        super.iPhone();
        System.out.println("SmartPhone is booting up...");
    }

    {
        super.Samsung();
        System.out.println("SmartPhone is shutting down...");
    }

    {
        super.Pixel();
        System.out.println("SmartPhone is charging...");
    }

    {
        super.OnePlus();
        System.out.println("SmartPhone is now connected to the internet.");
    }

    {
        super.Redmi();
        System.out.println("SmartPhone software is up-to-date.");
    }
}
