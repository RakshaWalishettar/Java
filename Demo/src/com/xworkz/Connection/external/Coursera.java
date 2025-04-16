package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.OnlineLearning;

public class Coursera implements OnlineLearning {
    public void startCourse() {
        System.out.println("Starting course on Coursera.");
    }

    public void submitAssignment() {
        System.out.println("Submitting assignment on Coursera.");
    }

    public void takeQuiz() {
        System.out.println("Taking quiz on Coursera.");
    }
}
