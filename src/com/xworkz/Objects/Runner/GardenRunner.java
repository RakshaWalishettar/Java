package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Gallery;
import com.xworkz.Objects.internal.Garden;

public class GardenRunner {
    public static void main(String[] args) {
        Garden garden = new Garden("Botanic Bliss", 'F', 300);
        Garden garden1=new Garden("Botenic Bliss",'F',963);
        System.out.println(garden);
        System.out.println("the garden has:"+(garden==garden1));
        boolean same=garden.equals(garden1);
        System.out.println("both garden and garden1 are same :"+same);


        int code = garden.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(garden));
    }
}
