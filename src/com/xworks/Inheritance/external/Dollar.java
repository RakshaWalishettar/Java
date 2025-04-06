package com.xworks.Inheritance.external;

public class Dollar extends Currency{
    public Dollar() {
        System.out.println("No-args constructor Dollar");
    }
    @Override
    public void exchange(){
        System.out.println("Dollar is being exchanged...");
    }
    @Override
    public void storeValue(){
        System.out.println("Dollar stores value efficiently...");
    }
    @Override
    public void facilitateTrade(){
        System.out.println("Dollar facilitates international trade...");
    }
    @Override
    public void measureValue(){
        System.out.println("Dollar measures economic value...");
    }
    @Override
    public void serveAsUnit(){
        System.out.println("Dollar serves as a global unit of account...");
    }
}
