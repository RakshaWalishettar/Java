package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Farm;

public class FarmRunner {
    public static void main(String[] args) {
        Farm farm = new Farm("GreenGrow", 'W', 60);
        Farm farm1=new Farm("GreenGrow",'W',70);
        System.out.println(farm);
        System.out.println("the farm has:"+(farm==farm1));
        boolean same=farm.equals(farm1);
        System.out.println("both farm and farm1 are same :"+same);


        int code = farm.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(farm));
    }
}
