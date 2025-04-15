package com.xworkz.Multilevelinheritance.internal;

public class Institution {
    void provideEducation() {
        System.out.println("Institution provides education");
    }
}

class School extends Institution {
    void conductExams() {
        System.out.println("School conducts exams");
    }
}

class HighSchool extends School {
    void prepareForBoards() {
        System.out.println("High School prepares students for board exams");
    }

    public static void main(String[] args) {
        HighSchool hs = new HighSchool();
        hs.provideEducation();
        hs.conductExams();
        hs.prepareForBoards();
    }
}
