package com.xworks.Inheritance.external;

public class College extends University{
    public College() {
        System.out.println("No-args constructor of College");
    }
    @Override
    public void conductExams(){
        System.out.println("College is conducting exams...");
    }
    @Override
    public void scheduleClasses(){
        System.out.println("College is scheduling classes...");
    }
    @Override
    public void manageFaculty(){
        System.out.println("College is managing faculty...");
    }
    @Override
    public void admitStudents(){
        System.out.println("College is admitting students...");
    }
    @Override
    public void organizeEvents(){
        System.out.println("College is organizing events...");
    }
    public void games(){
        System.out.println("runner the games");

    }
}
