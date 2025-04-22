package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.OperatingSystem;
import com.xworkz.Implement.internal.Laptop;
import com.xworkz.Implement.internal.OS;

public class OperatingRunner {
    public static void main(String[] args) {
        Laptop laptop=new OS();
        OperatingSystem operatingSystem=new OperatingSystem(laptop);
        operatingSystem.machine();
        laptop.process();
    }
}
