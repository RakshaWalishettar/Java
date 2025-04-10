package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Hotel;

public class HotelRunner {
    public static void main(String[] args) {
        Hotel h = new Hotel("Grand Plaza", 'A', 80);
        System.out.println(h);

        int code = h .hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(h));
    }
}
