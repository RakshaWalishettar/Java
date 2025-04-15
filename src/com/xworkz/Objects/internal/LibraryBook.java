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
    public boolean equals(Object obj) {
        if(obj!=null)
        {
            System.out.println("ref is not null");
            if(obj instanceof LibraryBook)
            {
                System.out.println("ref is librarybook, will compare...");
                LibraryBook libraryBook1=this;
                LibraryBook libraryBook2=(LibraryBook) obj;//why should i do casting ??
                if(libraryBook1.title.equals(libraryBook2.title) && libraryBook1.category==libraryBook2.category )
                {
                    System.out.println("both librarybook are same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "LibraryBook [title=" + title + ", category=" + category + ", pages=" + pages + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return -47;
    }
}
