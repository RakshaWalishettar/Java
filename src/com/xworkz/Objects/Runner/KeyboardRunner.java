package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Keyboard;

public class KeyboardRunner {
    public static void main(String[] args) {
        Keyboard k = new Keyboard("QWERTY", 'M', 104);
        Keyboard k1=new Keyboard("QWERTY",'M',563);
        System.out.println(k);
        System.out.println("the farm has:"+(k==k1));
        boolean same=k.equals(k1);
        System.out.println("both farm and farm1 are same :"+same);


        int code = k.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(k));
    }
}
