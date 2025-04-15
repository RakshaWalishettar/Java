package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Cup;

public class CupRunner {
    public static void main(String[] args) {
        Cup cup1 = new Cup("Ceramic", 'S', 250);

        Cup cup2=new Cup("Ceramic",'M',350);

        System.out.println("the cup has:"+(cup1==cup2));
        boolean same=cup1.equals(cup2);
        System.out.println("both cup1 and cup2 are same :"+same);


        int code = cup1.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(cup1));
    }
}
