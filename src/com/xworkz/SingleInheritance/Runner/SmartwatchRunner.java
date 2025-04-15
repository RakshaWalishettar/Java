package com.xworkz.SingleInheritance.Runner;

import com.xworkz.SingleInheritance.external.SmartWatch;

public class SmartwatchRunner {
    public static void main(String[] args) {
        SmartWatch sw = new SmartWatch();
        sw.turnOn();
        sw.trackSteps();
    }
}
