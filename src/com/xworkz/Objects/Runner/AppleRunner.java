package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.AirConditioner;
import com.xworkz.Objects.internal.Apple;

public class AppleRunner {
    public static void main(String[] args) {
        Apple apple1 = new Apple("kashmir apple", 'M', 50);

        Apple apple2=new Apple("Kashmir apple",'B',500);

        System.out.println("the Apple has:"+(apple1==apple2));
        boolean same=apple1.equals(apple2);
        System.out.println("both apple1 and apple2 are same :"+same);


        int code = apple1.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: "+System.identityHashCode(apple1));    }
}