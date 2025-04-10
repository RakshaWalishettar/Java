package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.AirConditioner;
import com.xworkz.Objects.internal.Bakery;

public class BakeryRunner {
    public static void main(String[] args) {
        Bakery bakery = new Bakery("SweetTreats", 'C', 50);
        System.out.println(bakery);

        int code = bakery.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: "+System.identityHashCode(bakery));    }
}
