package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.AirConditioner;
import com.xworkz.Objects.internal.Apple;

public class AppleRunner {
    public static void main(String[] args) {
        Apple apple = new Apple("kashmir apple", 'M', 50);
        System.out.println(apple);

        int code = apple.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: "+System.identityHashCode(apple));    }
}