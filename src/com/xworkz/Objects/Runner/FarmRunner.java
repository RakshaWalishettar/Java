package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Farm;

public class FarmRunner {
    public static void main(String[] args) {
        Farm farm = new Farm("GreenGrow", 'W', 60);
        System.out.println(farm);

        int code = farm.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(farm));
    }
}
