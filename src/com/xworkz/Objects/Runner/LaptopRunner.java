package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Laptop;

public class LaptopRunner {
    public static void main(String[] args){
        Laptop laptop=new Laptop("Dell",'A',75000);
        System.out.println(laptop);

        int code = laptop.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(laptop));
    }
}
