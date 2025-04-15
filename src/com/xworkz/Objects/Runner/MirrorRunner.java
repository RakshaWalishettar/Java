package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Mirror;

public class MirrorRunner {
    public static void main(String[] args) {
        Mirror mirror1 = new Mirror("Oval", 'W', 60);
        Mirror mirror2=new Mirror("Oval",'W',50);
        System.out.println(mirror1);


        System.out.println("the cup has:"+(mirror1==mirror2));
        boolean same=mirror1.equals(mirror2);
        System.out.println("both cup1 and cup2 are same :"+same);


        int code = mirror1.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(mirror1));
    }
}
