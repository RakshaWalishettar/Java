package com.xworks.Inheritance.external;

public class Camera extends Capture{
    public Camera() {
        System.out.println("No-args constructor: Camera");
    }
    @Override
    public void takePhoto(){
        System.out.println("Camera is taking a photo...");
    }
    @Override
    public void recordVideo(){
        System.out.println("Camera is recording a video...");
    }
    @Override
    public void zoomIn(){
        System.out.println("Camera is zooming in...");
    }
    @Override
    public  void adjustBrightness(){
        System.out.println("Camera is adjusting brightness...");
    }
    @Override
    public void storeImages(){
        System.out.println("Camera is storing images...");
    }
    public void lens() {
        System.out.println("it has the lens");
    }
}
