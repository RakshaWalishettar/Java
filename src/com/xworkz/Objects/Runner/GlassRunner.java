package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Glass;

public class GlassRunner {
    public static void main(String[] args) {
        Glass g = new Glass("Round", 'M', 100);
        Glass g1=new Glass("Round",'M',530);
        System.out.println(g);
        System.out.println("the glass has:"+(g==g1));
        boolean same=g.equals(g1);
        System.out.println("both glass and glass1 are same :"+same);


        int code = g.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(g));
    }
}
