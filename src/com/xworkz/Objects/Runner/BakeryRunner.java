package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.AirConditioner;
import com.xworkz.Objects.internal.Bakery;

public class BakeryRunner {
    public static void main(String[] args) {
        Bakery bakery1 = new Bakery("SweetTreats", 'C', 50);
        Bakery bakery2 = new Bakery("SweetTreats",'D',60);

        System.out.println("the bakery has:"+(bakery1==bakery2));
        boolean same=bakery1.equals(bakery2);
        System.out.println("both bakery and bakery are same :"+same);


        int code = bakery1.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: "+System.identityHashCode(bakery1));    }
}
