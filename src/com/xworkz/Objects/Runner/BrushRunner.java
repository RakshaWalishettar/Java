package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Brush;

public class BrushRunner {
    public static void main(String[] args) {
        Brush brush1 = new Brush("Toothbrush", 'H', 40);
        Brush brush2 =new Brush("Toothbrush",'g',35);
        System.out.println(brush1);

        System.out.println("the Brush has:"+(brush1==brush2));
        boolean same=brush1.equals(brush2);
        System.out.println("both brush1 and brush2 are same :"+same);


        int code = brush1.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(brush1));
    }
}
