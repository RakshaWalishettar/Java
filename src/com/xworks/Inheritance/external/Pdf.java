package com.xworks.Inheritance.external;

public class Pdf extends Document{
    public Pdf() {
        System.out.println("PDF document created.");
    }
    @Override
    public void open(){
        System.out.println("PDF file is opening...");
    }
    @Override
    public void read(){
        System.out.println("Reading PDF file...");
    }
    @Override
    public void write(){
        System.out.println("Writing to PDF...");
    }
    @Override
    public void save(){
        System.out.println("Saving PDF file...");
    }
    @Override
    public void close(){
        System.out.println("Closing PDF file...");
    }
}
