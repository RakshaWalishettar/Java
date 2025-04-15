package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Bed;


public class BedRunner {
    public static void main(String[] args) {
        Bed bed1 = new Bed('K', "karlon", "wood");
        Bed bed2=new Bed('K',"cotton","metal");
        System.out.println(bed1);

        int code = bed1.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(bed1));
    }
}
