package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Gallery;

public class GalleryRunner {
    public static void main(String[] args) {
        Gallery g = new Gallery("CanvasCore", 'M', 250);
        System.out.println(g);

        int code = g.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(g));
    }
}
