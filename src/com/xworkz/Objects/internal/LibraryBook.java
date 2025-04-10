package com.xworkz.Objects.internal;

public class LibraryBook {
    private String title;
    private char category;
    private int pages;

    public LibraryBook(String title, char category, int pages) {
        this.title = title;
        this.category = category;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "LibraryBook [title=" + title + ", category=" + category + ", pages=" + pages + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 50;
    }
}
