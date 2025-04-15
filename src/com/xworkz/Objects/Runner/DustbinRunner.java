package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Dustbin;

public class DustbinRunner {
    public static void main(String[] args) {
        Dustbin dustbin = new Dustbin("Green", 'F', 20);
        Dustbin dustbin1=new Dustbin("Green",'F',63);
        System.out.println(dustbin);
        System.out.println("the dustbin has:"+(dustbin==dustbin1));
        boolean same=dustbin.equals(dustbin1);
        System.out.println("both dustbin1 and dustbin2 are same :"+same);

        int code = dustbin.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(dustbin));
    }
}
