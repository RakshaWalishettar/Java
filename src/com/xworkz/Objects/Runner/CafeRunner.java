package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Cafe;

public class CafeRunner {
    public static void main(String[] args) {
        Cafe cafe1 = new Cafe("JavaCafe", 'M', 20);
        Cafe cafe2=new Cafe("JavaCafe",'g',5);
        System.out.println(cafe1);

        System.out.println("the cafe has:"+(cafe1==cafe2));
        boolean same=cafe1.equals(cafe2);
        System.out.println("both cafe1 and cafe2 are same :"+same);


        int code = cafe1.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(cafe1));
    }
}
