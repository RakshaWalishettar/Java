package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Hardware;
import com.xworks.Inheritance.external.Storage;

public class HardwareRunner {
    public static void main(String[] args) {
        Hardware hardware = new Hardware();
        hardware.storeData();
        hardware.retrieveData();
        hardware.disconnect();
        hardware.format();
        hardware.connect();

        System.out.println("========================");
        Storage storage1 = new Storage();
        storage1.connect();
        storage1.disconnect();
        storage1.format();
        storage1.retrieveData();
        storage1.storeData();
    }
}
