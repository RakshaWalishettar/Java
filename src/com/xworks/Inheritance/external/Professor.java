package com.xworks.Inheritance.external;

public class Professor extends Teacher{
    public void professor() {
        System.out.println("Professor constructor called.");
    }

    {
        super.teach();
        System.out.println("Professor is giving a lecture...");
    }

    {
        super.evaluateStudents();
        System.out.println("Professor is evaluating research papers...");
    }

    {
        super.prepareLesson();
        System.out.println("Professor is preparing advanced lessons...");
    }

    {
        super.attendMeeting();
        System.out.println("Professor is attending faculty meetings...");
    }

    {
        super.gradePapers();
        System.out.println("Professor is grading university papers...");
    }
}
