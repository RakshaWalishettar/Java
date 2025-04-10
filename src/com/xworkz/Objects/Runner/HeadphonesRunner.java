package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.HeadPhone;

public class HeadphonesRunner {
    public static void main(String[] args) {
        HeadPhone h = new HeadPhone("Sony", 'B', 40);
        System.out.println(h);

        int code = h.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(h));
    }
}
