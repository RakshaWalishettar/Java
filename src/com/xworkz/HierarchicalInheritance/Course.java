package com.xworkz.HierarchicalInheritance;

public class Course {
    void enroll() {
        System.out.println("Student enrolls in a course");
    }
}

class MathCourse extends Course {
    void solveEquations() {
        System.out.println("Solving algebraic equations");
    }
}

class ScienceCourse extends Course {
    void conductExperiment() {
        System.out.println("Conducting a lab experiment");
    }

    public static void main(String[] args) {
        MathCourse math = new MathCourse();
        math.enroll();
        math.solveEquations();

        ScienceCourse science = new ScienceCourse();
        science.enroll();
        science.conductExperiment();
    }
}
