package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.HeadPhone;

public class HeadphonesRunner {
    public static void main(String[] args) {
        HeadPhone h = new HeadPhone("Sony", 'B', 40);
        HeadPhone h1=new HeadPhone("Sony",'B',50);
        System.out.println(h);

        System.out.println("the headphone has:"+(h==h1));
        boolean same=h.equals(h1);
        System.out.println("both h and h1 are same :"+same);

        int code = h.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(h));
    }
}
