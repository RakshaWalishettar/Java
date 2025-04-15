package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Chair;

public class ChairRunner {
    public static void main(String[] args){
        Chair chair1=new Chair("palstic",'B',60);
        Chair chair2=new Chair("plastic",'H',50);

        System.out.println("the AC has:"+(chair1==chair2));
        boolean same=chair1.equals(chair2);
        System.out.println("both AC1 and AC2 are same :"+same);


        int code = chair1.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(chair1));
    }
}
