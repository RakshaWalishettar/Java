package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.BottelCap;

public class BottleCapRunner {
    public static void main(String[] args) {
        BottelCap cap = new BottelCap("Plastic", 'R', 30);
        BottelCap cap2=new BottelCap("Plastic",'k',14);
        System.out.println(cap);

        System.out.println("the cap has:"+(cap==cap2));
        boolean same=cap.equals(cap2);
        System.out.println("both cap and cap2 are same :"+same);


        int code = cap.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(cap));
    }
}
