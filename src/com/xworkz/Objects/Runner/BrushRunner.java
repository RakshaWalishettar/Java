package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Brush;

public class BrushRunner {
    public static void main(String[] args) {
        Brush brush = new Brush("Toothbrush", 'H', 40);
        System.out.println(brush);

        int code = brush.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(brush));
    }
}
