package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Chair;

public class ChairRunner {
    public static void main(String[] args){
        Chair chair=new Chair("palstic",'B',60);
        System.out.println(chair);

        int code = chair.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(chair));
    }
}
