package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Mall;

public class MallRunner {
    public static void main(String[] args) {
        Mall m = new Mall("MetroMall", 'N', 120);
        System.out.println(m);

        int code = m.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(m));
    }
}
