package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Dustbin;

public class DustbinRunner {
    public static void main(String[] args) {
        Dustbin dustbin = new Dustbin("Green", 'F', 20);
        System.out.println(dustbin);

        int code = dustbin.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(dustbin));
    }
}
