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
    public String toString() {
        return "Book [model=" + model + ", rating=" + rating + ", value=" + value + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 14;
    }
}
