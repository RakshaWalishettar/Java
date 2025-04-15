package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Laptop;

public class LaptopRunner {
    public static void main(String[] args){
        Laptop laptop=new Laptop("Dell",'A',75000);
        Laptop laptop1=new Laptop("Dell",'A',8653);
        System.out.println(laptop);
        System.out.println("the farm has:"+(laptop==laptop1));
        boolean same=laptop.equals(laptop1);
        System.out.println("both farm and farm1 are same :"+same);

        int code = laptop.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(laptop));
    }
}
