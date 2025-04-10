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
    public String toString() {
        return "BookStore [name=" + name + ", section=" + section + ", booksAvailable=" + booksAvailable + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 15;
    }
}
