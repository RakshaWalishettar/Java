package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.AirConditioner;
import com.xworkz.Objects.internal.Banana;

public class BananaRunner {
    public static void main(String[] args) {
        Banana banana1 = new Banana("raw", 'M', 35);
        Banana banana2=new Banana("raw",'S',50);

        System.out.println("the AC has:"+(banana1==banana2));
        boolean same=banana1.equals(banana2);
        System.out.println("both AC1 and AC2 are same :"+same);


        int code = banana1.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: "+System.identityHashCode(banana1));
    }
}
