package com.xworkz.SingleInheritance.Runner;

import com.xworkz.SingleInheritance.external.Bicycle;

public class BicycleRunner {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle();
        bike.move();
        bike.pedal();
    }
}
