package com.xworkz.SingleInheritance.Runner;

import com.xworkz.SingleInheritance.external.Book;

public class BookRunner {
    public static void main(String[] args) {
        Book b = new Book();
        b.checkout();
        b.read();
    }
}
