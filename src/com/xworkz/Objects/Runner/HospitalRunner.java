package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Hospital;

public class HospitalRunner {
    public static void main(String[] args) {
        Hospital h = new Hospital("CityCare", 'M', 150);
        Hospital h1=new Hospital("CityCare",'M',465);
        System.out.println(h);


        System.out.println("the hospital has:"+(h==h1));
        boolean same=h.equals(h1);
        System.out.println("both farm and farm1 are same :"+same);

        int code = h.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(h));
    }
}
