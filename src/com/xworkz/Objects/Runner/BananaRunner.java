package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.AirConditioner;
import com.xworkz.Objects.internal.Banana;

public class BananaRunner {
    public static void main(String[] args) {
        Banana banana = new Banana("raw", 'M', 35);
        System.out.println(banana);

        int code = banana.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: "+System.identityHashCode(banana));
    }
}
