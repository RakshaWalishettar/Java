package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Gallery;

public class GalleryRunner {
    public static void main(String[] args) {
        Gallery g = new Gallery("CanvasCore", 'M', 250);
        Gallery g1=new Gallery("CanavasCore",'M',630);
        System.out.println(g);

        System.out.println("the gallery has:"+(g==g1));
        boolean same=g.equals(g1);
        System.out.println("both gallery and gallery1 are same :"+same);

        int code = g.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(g));
    }
}
