package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.FanRemote;

public class FanRemoteRunner {
    public static void main(String[] args) {
        FanRemote fan = new FanRemote("Orient", 'S', 5);
        System.out.println(fan);

        int code = fan.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(fan));
    }
}
