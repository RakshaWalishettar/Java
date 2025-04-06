package com.xworks.Inheritance.external;

public class Router extends NetworkDevice{
    public Router() {
        System.out.println("Router is initialized.");
    }
    @Override
    public void powerOn(){
        System.out.println("Router is powering on...");
    }
    @Override
    public void connect(){
        System.out.println("Router is connecting to the internet...");
    }
    @Override
    public void disconnect(){
        System.out.println("Router is disconnecting from the internet...");
    }
    @Override
    public void reset(){
        System.out.println("Router is performing a factory reset...");
    }
    @Override
    public void powerOff(){
        System.out.println("Router is shutting down...");
    }
}
