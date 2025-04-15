package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Juicer;

public class JuicerRunner {
    public static void main(String[] args) {
        Juicer j = new Juicer("Philips", 'S', 3);
        Juicer j1=new Juicer("Philips",'S',5);
        System.out.println(j);

        System.out.println("the farm has:"+(j==j1));
        boolean same=j.equals(j1);
        System.out.println("both farm and farm1 are same :"+same);


        int code = j.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(j));
    }
}
