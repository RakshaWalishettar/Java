package com.xworkz.Connection.internal;

public interface University {
    void enrollStudent();
    void conductExam();
    void declareResults();
    default void idScanner() {
        System.out.println("Welcome!");
    }
}
