package com.xworks.Inheritance.external;

public class Graduate extends Student{
    public void GraduateStudent() {
        System.out.println("No-args constructor of GraduateStudent");
    }

    {
        super.study();
        System.out.println("GraduateStudent is studying advanced topics...");
    }

    {
        super.attendClasses();
        System.out.println("GraduateStudent is attending specialized classes...");
    }

    {
        super.submitAssignments();
        System.out.println("GraduateStudent is submitting research papers...");
    }

    {
        super.takeExams();
        System.out.println("GraduateStudent is taking thesis defense...");
    }

    {
        super.graduate();
        System.out.println("GraduateStudent is earning a postgraduate degree...");
    }
}
