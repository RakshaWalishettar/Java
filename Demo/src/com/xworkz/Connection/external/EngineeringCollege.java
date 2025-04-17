package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.University;

public class EngineeringCollege implements University {
    public void enrollStudent() {
        System.out.println("Student enrolled in engineering program.");
    }

    public void conductExam() {
        System.out.println("Conducting semester exams...");
    }

    public void declareResults() {
        System.out.println("Results declared.");
    }
    @Override
    public void idScanner() {
        System.out.println("Welcome!");
    }
}
