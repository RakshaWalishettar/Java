package com.xworkz.HierarchicalInheritance;

public class LibraryItem {
    void checkout() {
        System.out.println("Checking out item from library");
    }
}

class Book extends LibraryItem {
    void readBook() {
        System.out.println("Reading a book");
    }
}

class DVD extends LibraryItem {
    void playDVD() {
        System.out.println("Playing a DVD");
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.checkout();
        b.readBook();

        DVD d = new DVD();
        d.checkout();
        d.playDVD();
    }
}
