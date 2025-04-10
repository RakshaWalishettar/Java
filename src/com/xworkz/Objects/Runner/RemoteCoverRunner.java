package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.RemoteCover;

public class RemoteCoverRunner {
    public static void main(String[] args) {
        RemoteCover r = new RemoteCover("Silicon", 'B', 60);
        System.out.println(r);

        int code = r.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(r));
    }
}
