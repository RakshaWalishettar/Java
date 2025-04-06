package com.xworks.Inheritance.external;

public class SmartPhone extends Mobile{
    public SmartPhone() {
        System.out.println("no-args const SmartPhone");
    }

    @Override
    public void iPhone(){
        System.out.println("SmartPhone is booting up...");
    }

    @Override
    public void Samsung(){
        System.out.println("SmartPhone is shutting down...");
    }

    @Override
    public void Pixel(){
        System.out.println("SmartPhone is charging...");
    }

    @Override
    public void OnePlus(){
        System.out.println("SmartPhone is now connected to the internet.");
    }

    @Override
    public void Redmi(){
        System.out.println("SmartPhone software is up-to-date.");
    }
}
