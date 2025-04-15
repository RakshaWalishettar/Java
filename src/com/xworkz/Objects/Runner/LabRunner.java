package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Lab;

public class LabRunner {
    public static void main(String[] args) {
        Lab l = new Lab("BioLab", 'B', 150);
        Lab l1=new Lab("BioLab",'B',452);
        System.out.println(l);

        System.out.println("the farm has:"+(l==l1));
        boolean same=l.equals(l1);
        System.out.println("both farm and farm1 are same :"+same);


        int code = l.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(l));
    }
}
