package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Hostel;

public class HostelRunner {
    public static void main(String[] args) {
        Hostel h = new Hostel("YouthStay", 'M', 100);
        Hostel h1=new Hostel("YouthStay",'M',563);
        System.out.println(h);

        System.out.println("the Hostel has:"+(h==h1));
        boolean same=h.equals(h1);
        System.out.println("both Hostel and Hostel1 are same :"+same);

        int code = h.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(h));
    }
}
