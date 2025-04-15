package com.xworkz.Objects.internal;

public class BookStore {
    private String name;
    private char section;
    private int booksAvailable;

    public BookStore(String name, char section, int booksAvailable) {
        this.name = name;
        this.section = section;
        this.booksAvailable = booksAvailable;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof BookStore) {
                System.out.println("Object is an instance of Bookstore");
                BookStore other = (BookStore) obj;
                if (this.name.equals(other.name)) {
                    System.out.println("Both Bookstore are the same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "BookStore [name=" + name + ", section=" + section + ", booksAvailable=" + booksAvailable + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 15;
    }
}
