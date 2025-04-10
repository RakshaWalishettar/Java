package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Shoe;

public class ShoeRunner {
    public static  void main(String[] args) {
        Shoe s = new Shoe("Nike", 'A', 120);
        System.out.println(s);

        int code = s.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(s));
    }
}
