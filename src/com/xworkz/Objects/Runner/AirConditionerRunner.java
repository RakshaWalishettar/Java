package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.AirConditioner;

public class AirConditionerRunner {
    public static void main(String[] args) {
        AirConditioner ac1 = new AirConditioner("Voltas", 'S', 2);

        AirConditioner ac2=new AirConditioner("Voltas",'H',2);

        System.out.println("the AC has:"+(ac1==ac2));
        boolean same=ac1.equals(ac2);
        System.out.println("both AC1 and AC2 are same :"+same);


        int code = ac1.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: "+System.identityHashCode(ac1));

    }
}

