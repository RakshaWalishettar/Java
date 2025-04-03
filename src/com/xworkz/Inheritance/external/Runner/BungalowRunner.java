package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Bungalow;
import com.xworks.Inheritance.external.House;

public class BungalowRunner {
    public static void main(String[] args) {
        House house = new Bungalow();  // Polymorphic behavior
        House house1 = new House();
    }
}
