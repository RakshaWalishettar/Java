package com.xworks.Inheritance.external;

public class Professor extends Teacher{
    public Professor() {
        System.out.println("Professor constructor called.");
    }
    @Override
    public void teach(){
        System.out.println("Professor is giving a lecture...");
    }
    @Override
    public void evaluateStudents(){
        System.out.println("Professor is evaluating research papers...");
    }
    @Override
    public void prepareLesson(){
        System.out.println("Professor is preparing advanced lessons...");
    }
    @Override
    public void attendMeeting(){
        System.out.println("Professor is attending faculty meetings...");
    }
    @Override
    public void gradePapers(){
        System.out.println("Professor is grading university papers...");
    }
}
