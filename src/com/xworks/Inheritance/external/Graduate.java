package com.xworks.Inheritance.external;

public class Graduate extends Student{
    public Graduate() {
        System.out.println("No-args constructor of GraduateStudent");
    }
    @Override
    public void study(){
        System.out.println("GraduateStudent is studying advanced topics...");
    }
    @Override
    public void attendClasses(){
        System.out.println("GraduateStudent is attending specialized classes...");
    }
    @Override
    public void submitAssignments(){
        System.out.println("GraduateStudent is submitting research papers...");
    }
    @Override
    public void takeExams(){
        System.out.println("GraduateStudent is taking thesis defense...");
    }
    @Override
    public void graduate(){
        System.out.println("GraduateStudent is earning a postgraduate degree...");
    }
}
