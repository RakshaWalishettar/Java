package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Cinema;

public class CinemaRunner {
    public static void main(String[] args) {
        Cinema cinema = new Cinema("CineMax", 'B', 20);
        System.out.println(cinema);

        int code = cinema.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(cinema));
    }
}
