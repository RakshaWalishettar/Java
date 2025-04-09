package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.BookStore;

public class BookStoreRunner {
    public static void main(String[] args) {
        BookStore bs = new BookStore("Readers Point", 'F', 1200);
        System.out.println(bs);
    }
}
