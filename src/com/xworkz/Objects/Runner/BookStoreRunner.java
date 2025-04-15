package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.BookStore;

public class BookStoreRunner {
    public static void main(String[] args) {
        BookStore bs1 = new BookStore("Readers Point", 'F', 1200);
        BookStore bs2=new BookStore("Readers Point",'S',863);
        System.out.println(bs1);

        System.out.println("the bookstore has:"+(bs1==bs2));
        boolean same=bs1.equals(bs2);
        System.out.println("both bookstore1 and bookstore2 are same :"+same);


        int code = bs1.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(bs1));
    }
}
