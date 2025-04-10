package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Hostel;

public class HostelRunner {
    public static void main(String[] args) {
        Hostel h = new Hostel("YouthStay", 'M', 100);
        System.out.println(h);

        int code = h.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(h));
    }
}
