package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Factory;

public class FactoryRunner {
    public static void main(String[] args) {
        Factory factory = new Factory("SteelMakers", 'S', 500);
        Factory factory1=new Factory("SteelMakers",'S',653);
        System.out.println(factory);

        System.out.println("the factory has:"+(factory==factory1));
        boolean same=factory.equals(factory1);
        System.out.println("both factory1 and factory2 are same :"+same);


        int code = factory.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(factory));
    }
}
