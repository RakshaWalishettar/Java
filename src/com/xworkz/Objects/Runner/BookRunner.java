package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Book;

public class BookRunner {
    public static void main(String[] args){
        Book book=new Book("textbook",'A',350);
        System.out.println(book);

        int code = book.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(book));
    }
}
