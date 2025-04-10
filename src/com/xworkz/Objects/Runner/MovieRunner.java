package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Movie;

public class MovieRunner {
    public static void main(String[] args) {
        Movie m = new Movie("Inception", 'S', 148);
        System.out.println(m);

        int code = m.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(m));
    }
}
