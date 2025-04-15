package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.ConventionCenter;

public class ConventionCenterRunner {
    public static void main(String[] args) {
        ConventionCenter cc1 = new ConventionCenter("ExpoCenter", 'E', 2000);
         ConventionCenter cc2=new ConventionCenter("ExpoCenter",'D',5123);

        System.out.println("the cc has:"+(cc1==cc2));
        boolean same=cc1.equals(cc2);
        System.out.println("both CC1 and CC2 are same :"+same);


        int code = cc1.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(cc2));
    }
}
