package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.AirConditioner;
import com.xworkz.Objects.internal.Bag;

public class BagRunner {
    public static void main(String[] args) {
        Bag bag1 = new Bag("Red", 'L', 550);
        Bag bag2 = new Bag("Red",'S',80);

        System.out.println("the AC has:"+(bag1==bag2));
        boolean same=bag1.equals(bag2);
        System.out.println("both AC1 and AC2 are same :"+same);


        int code = bag1.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: "+System.identityHashCode(bag2));
    }
}
