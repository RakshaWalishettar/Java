package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Restaurant;

public class RestaurantRunner {
    public static void main(String[] args) {
        Restaurant r = new Restaurant("SpiceRoute", 'I', 80);
        System.out.println(r);

        int code = r.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(r));
    }
}
