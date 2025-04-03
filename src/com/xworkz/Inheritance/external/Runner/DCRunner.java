package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Clock;
import com.xworks.Inheritance.external.DigitalClock;

public class DCRunner {
    public static void main(String[] args) {
        Clock clock = new DigitalClock(); // Polymorphism
        Clock clock1 = new Clock();
    }
}
