package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Professor;
import com.xworks.Inheritance.external.Teacher;

public class ProfessorRunner {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.prepareLesson();
        professor.teach();
        professor.attendMeeting();
        professor.gradePapers();
        professor.evaluateStudents();

        System.out.println("===================================");
        Teacher teacher = new Teacher();
        teacher.attendMeeting();
        teacher.teach();
        teacher.evaluateStudents();
        teacher.gradePapers();
        teacher.prepareLesson();
    }
}
