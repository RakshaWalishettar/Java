package com.xworks.Inheritance.external;

public class Camera extends Capture{
    public Camera() {
        System.out.println("No-args constructor: Camera");
    }

    {
        super.takePhoto();
        System.out.println("Camera is taking a photo...");
    }

    {
        super.recordVideo();
        System.out.println("Camera is recording a video...");
    }

    {
        super.zoomIn();
        System.out.println("Camera is zooming in...");
    }

    {
        super.adjustBrightness();
        System.out.println("Camera is adjusting brightness...");
    }

    {
        super.storeImages();
        System.out.println("Camera is storing images...");
    }
}
