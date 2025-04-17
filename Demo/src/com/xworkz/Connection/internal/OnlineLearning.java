package com.xworkz.Connection.internal;

public interface OnlineLearning {
    void startCourse();
    void submitAssignment();
    void takeQuiz();
    default void greatlearning() {
        System.out.println("Welcome, how  can i help.");
    }
}
