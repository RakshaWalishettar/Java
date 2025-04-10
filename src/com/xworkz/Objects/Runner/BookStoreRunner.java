package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.BookStore;

public class BookStoreRunner {
    public static void main(String[] args) {
        BookStore bs = new BookStore("Readers Point", 'F', 1200);
        System.out.println(bs);

        int code = bs.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(bs));
    }
}
