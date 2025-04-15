package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Lab;
import com.xworkz.Objects.internal.LibraryBook;

public class LibraryBookRunner {
    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook("Java Basics", 'T', 300);
        LibraryBook libraryBook=new LibraryBook("Java Basic",'T',300);
        System.out.println(lb);

        System.out.println("the farm has:"+(lb==libraryBook));
        boolean same=lb.equals(libraryBook);
        System.out.println("both farm and farm1 are same :"+same);

        int code = lb.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(lb));
    }
}
