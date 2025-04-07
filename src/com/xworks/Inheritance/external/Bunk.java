package com.xworks.Inheritance.external;

public class Bunk extends University{
    public void nostudents(){
        System.out.println("no students in the class ");
    }
    public void games(University university){
        university.admitStudents();
        university.conductExams();
        university.manageFaculty();
        university.scheduleClasses();
        university.organizeEvents();

        if(university instanceof Bunk){
            Bunk bunk=(Bunk) university;
            System.out.println("bunk is the instanvce of the university");
            bunk.nostudents();
        }
    }
}
