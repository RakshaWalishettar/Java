package com.xworkz.Objects.internal;

public class Book {
    private String model;
    private char rating;
    private int value;

    public Book(String model, char rating, int value) {
        this.model = model;
        this.rating = rating;
        this.value = value;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof Book) {
                System.out.println("Object is an instance of Book");
                Book other = (Book) obj;
                if (this.model.equals(other.model)) {
                    System.out.println("Both Book are the same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Book [model=" + model + ", rating=" + rating + ", value=" + value + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 14;
    }
}
