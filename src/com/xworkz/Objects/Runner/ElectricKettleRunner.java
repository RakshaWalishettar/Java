package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.ElectricKettle;

public class ElectricKettleRunner {
    public static void main(String[] args) {
        ElectricKettle ek = new ElectricKettle("Prestige", 'S', 2);
        ElectricKettle ek1 =new ElectricKettle("Prestige",'S',6);
        System.out.println(ek);
        System.out.println("the electrickettle has:"+(ek==ek1));
        boolean same=ek.equals(ek1);
        System.out.println("both ek1 and ek2 are same :"+same);


        int code = ek.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(ek));
    }
}
