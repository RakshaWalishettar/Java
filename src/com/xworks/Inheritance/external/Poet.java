package com.xworks.Inheritance.external;

public class Poet extends Write{
    public Poet() {
        System.out.println("No-args constructor Poet");
    }
    @Override
    public void write(){
        System.out.println("Poet is writing poetry...");
    }
    @Override
    public void edit(){
        System.out.println("Poet is editing poetry...");
    }
    @Override
    public void publish(){
        System.out.println("Poet is publishing poetry...");
    }
    @Override
    public void research(){
        System.out.println("Poet is researching themes...");
    }
    @Override
    public void read(){
        System.out.println("Poet is reading literature...");
    }
}
