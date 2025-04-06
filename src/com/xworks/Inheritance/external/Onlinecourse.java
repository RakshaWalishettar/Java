package com.xworks.Inheritance.external;

public class Onlinecourse extends Course{
    public Onlinecourse(){
        System.out.println("no args const");
    }@Override
    public void enroll() {
        System.out.println("Accessing online course materials...");
    }
    @Override
    public void startCourse() {
        System.out.println("Joining a live session...");
    }@Override
    public void completeCourse() {
        System.out.println("Submitting an online assignment...");
    }
    @Override
    public void getCertificate() {
        System.out.println("Participating in an online discussion...");
    }
    @Override
    public void reviewCourse() {
        System.out.println("Taking an online quiz...");
    }
}
