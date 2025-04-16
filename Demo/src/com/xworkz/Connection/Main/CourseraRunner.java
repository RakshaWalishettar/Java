package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.Coursera;
import com.xworkz.Connection.internal.OnlineLearning;

public class CourseraRunner {
    public static void main(String[] args) {
        OnlineLearning platform = new Coursera();
        platform.startCourse();
        platform.submitAssignment();
        platform.takeQuiz();
    }
}
