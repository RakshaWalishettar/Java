package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Hotel;

public class HotelRunner {
    public static void main(String[] args) {
        Hotel h = new Hotel("Grand Plaza", 'A', 80);
        Hotel h1=new Hotel("Grand Plaze",'A',56);
        System.out.println(h);

        System.out.println("the farm has:"+(h==h1));
        boolean same=h.equals(h1);
        System.out.println("both farm and farm1 are same :"+same);

        int code = h .hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(h));
    }
}
