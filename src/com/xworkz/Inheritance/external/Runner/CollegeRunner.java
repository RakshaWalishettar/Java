package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Bunk;
import com.xworks.Inheritance.external.College;
import com.xworks.Inheritance.external.University;

public class CollegeRunner {
    public static void main(String[] args) {
        College college = new College();
        college.scheduleClasses();
        college.manageFaculty();
        college.conductExams();
        college.admitStudents();
        college.organizeEvents();

        System.out.println("============================");
        University university1 = new University();
        university1.admitStudents();
        university1.conductExams();
        university1.manageFaculty();
        university1.scheduleClasses();
        university1.organizeEvents();

        System.out.println("============================");

        Bunk bunk=new Bunk();
        bunk.games(university1);
        bunk.games(bunk);
    }
}
