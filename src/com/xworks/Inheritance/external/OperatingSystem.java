package com.xworks.Inheritance.external;

public class OperatingSystem extends Software{
    public OperatingSystem() {
        System.out.println("Operating System initialized.");
    }
    @Override
    public void bootUp(){
        System.out.println("Operating System is booting up...");
    }
    @Override
    public void manageMemory(){
        System.out.println("Operating System is managing memory...");
    }
    @Override
    public void handleProcesses(){
        System.out.println("Operating System is handling processes...");
    }
    @Override
    public void executePrograms(){
        System.out.println("Operating System is executing programs...");
    }
    @Override
    public void shutDown(){
        System.out.println("Operating System is shutting down...");
    }
}
