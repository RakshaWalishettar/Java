package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Bottle;

public class BottleRunner {
    public static void main(String[] args) {
        Bottle bottle1 = new Bottle("Plastic", 1.0, true);
        Bottle bottle2=new Bottle("Plastic",50,false);
        System.out.println(bottle1);

        System.out.println("the bottle has:"+(bottle1==bottle2));
        boolean same=bottle1.equals(bottle2);
        System.out.println("both bootle1 and bottle2 are same :"+same);


        int code = bottle1.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(bottle1));
    }
}
