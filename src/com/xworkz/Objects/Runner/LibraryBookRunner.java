package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.LibraryBook;

public class LibraryBookRunner {
    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook("Java Basics", 'T', 300);
        System.out.println(lb);

        int code = lb.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(lb));
    }
}
