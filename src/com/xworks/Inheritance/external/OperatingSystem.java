package com.xworks.Inheritance.external;

public class OperatingSystem extends Software{
    public void operatingSystem() {
        System.out.println("Operating System initialized.");
    }

    {
        super.bootUp();
        System.out.println("Operating System is booting up...");
    }

    {
        super.manageMemory();
        System.out.println("Operating System is managing memory...");
    }

    {
        super.handleProcesses();
        System.out.println("Operating System is handling processes...");
    }

    {
        super.executePrograms();
        System.out.println("Operating System is executing programs...");
    }

    {
        super.shutDown();
        System.out.println("Operating System is shutting down...");
    }
}
