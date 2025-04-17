package com.xworkz.Connection.internal;

public interface Chef {
    void prepareIngredients();
    void cook();
    void serveDish();
    default void sweet() {
        System.out.println("Welcome!");
    }
}
