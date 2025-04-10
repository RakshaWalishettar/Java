package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.AirConditioner;

public class AirConditionerRunner {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner("Voltas", 'S', 2);
        System.out.println(ac); // Will call toString()

        int code = ac.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: "+System.identityHashCode(ac));
    }
}

