package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Microwave;

public class MicrowaveRunner {
    public static void main(String[] args) {
        Microwave m = new Microwave("IFB", 'G', 800);
        Microwave m1=new Microwave("IFB",'G',896);
        System.out.println(m);


        System.out.println("the farm has:"+(m==m1));
        boolean same=m.equals(m1);
        System.out.println("both farm and farm1 are same :"+same);

        int code = m.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(m));
    }
}
