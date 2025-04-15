package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Mall;

public class MallRunner {
    public static void main(String[] args) {
        Mall m = new Mall("MetroMall", 'N', 120);
        Mall mall=new Mall("MetroMall",'N',86);
        System.out.println(m);
        System.out.println("the farm has:"+(m==mall));
        boolean same=m.equals(mall);
        System.out.println("both farm and farm1 are same :"+same);


        int code = m.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(m));
    }
}
