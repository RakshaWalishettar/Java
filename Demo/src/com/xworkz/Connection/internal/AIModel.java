package com.xworkz.Connection.internal;

public interface AIModel {
    void train();
    void predict();
    void evaluate();
    default void greatUser() {
        System.out.println("Welcome, User.");
    }

}
