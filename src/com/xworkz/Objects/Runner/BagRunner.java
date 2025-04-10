package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.AirConditioner;
import com.xworkz.Objects.internal.Bag;

public class BagRunner {
    public static void main(String[] args) {
        Bag b = new Bag("Red", 'L', 550);
        System.out.println(b);

        int code = b.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: "+System.identityHashCode(b));    }
}
