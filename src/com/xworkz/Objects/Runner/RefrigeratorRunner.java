package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Refrigerator;

public class RefrigeratorRunner {
    public static void main(String[] args) {
        Refrigerator r = new Refrigerator("LG", 'A', 340);
        System.out.println(r);

        int code = r.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(r));
    }
}
