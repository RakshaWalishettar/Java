package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Book;

public class BookRunner {
    public static void main(String[] args){
        Book book1=new Book("textbook",'A',350);
        Book book2=new Book("textbook",'4',56);
        System.out.println("the book has:"+(book1==book2));
        boolean same=book1.equals(book2);
        System.out.println("both book1 and book2 are same :"+same);

        System.out.println(book1);

        int code = book1.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(book1));
    }
}
