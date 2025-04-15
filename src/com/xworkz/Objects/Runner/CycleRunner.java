package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Cycle;

public class CycleRunner {
    public static void main(String[] args) {
        Cycle cycle = new Cycle("Hero", 'M', 18);
        Cycle cycle1=new Cycle("Hero",'M',5);
        System.out.println(cycle);
        System.out.println("the cycle has:"+(cycle==cycle1));
        boolean same=cycle.equals(cycle1);
        System.out.println("both cycle1 and cycle2 are same :"+same);


        int code = cycle.hashCode();
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(cycle));
    }
}
