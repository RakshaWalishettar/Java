package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.FireStation;

public class FireStationRunner {
    public static void main(String[] args) {
        FireStation fs = new FireStation("Downtown", 'A', 5);
        FireStation fs1=new FireStation("Downtown",'A',9);
        System.out.println(fs);

        System.out.println("the firstation has:"+(fs==fs1));
        boolean same=fs.equals(fs1);
        System.out.println("both firestation and firestation1 are same :"+same);


        int code = fs.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(fs));
    }
}
