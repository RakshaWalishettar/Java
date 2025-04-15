package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Mango;

public class MangoRunner {
    public static void main(String[] args) {
        Mango mango = new Mango("Yellow", 1.2, 8);
        Mango mango1=new Mango("Yellow",1.2,5);
        System.out.println(mango);


        System.out.println("the farm has:"+(mango==mango1));
        boolean same=mango.equals(mango1);
        System.out.println("both farm and farm1 are same :"+same);

        int code = mango.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(mango));
    }
}
