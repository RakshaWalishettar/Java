package com.xworks.Inheritance.external;

public class College extends University{
    public College() {
        System.out.println("No-args constructor of College");
    }

    {
        super.conductExams();
        System.out.println("College is conducting exams...");
    }

    {
        super.scheduleClasses();
        System.out.println("College is scheduling classes...");
    }

    {
        super.manageFaculty();
        System.out.println("College is managing faculty...");
    }

    {
        super.admitStudents();
        System.out.println("College is admitting students...");
    }

    {
        super.organizeEvents();
        System.out.println("College is organizing events...");
    }
}
