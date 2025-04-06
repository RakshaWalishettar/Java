package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.OperatingSystem;
import com.xworks.Inheritance.external.Software;

public class OSRunner {
    public static void main(String[] args) {
        OperatingSystem operatingSystem= new OperatingSystem();
        operatingSystem.shutDown();
        operatingSystem.manageMemory();
        operatingSystem.handleProcesses();
        operatingSystem.executePrograms();
        operatingSystem.bootUp();

        System.out.println("==================================");
        Software software = new Software();
        software.bootUp();
        software.executePrograms();
        software.handleProcesses();
        software.manageMemory();
        software.shutDown();
    }
}
