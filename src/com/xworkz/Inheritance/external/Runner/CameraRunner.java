package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Camera;
import com.xworks.Inheritance.external.Capture;
import com.xworks.Inheritance.external.Click;

public class CameraRunner {
    public static void main(String[] args) {
        Capture capture1 = new Capture();
        capture1.zoomIn();
        capture1.takePhoto();
        capture1.storeImages();
        capture1.adjustBrightness();
        capture1.recordVideo();

        System.out.println("===================");

        Camera camera=new Camera();
        camera.adjustBrightness();
        camera.recordVideo();
        camera.storeImages();
        camera.takePhoto();
        camera.zoomIn();

        System.out.println("============================");

        Click click=new Click();
        click.lens(click);
        click.lens(capture1);
    }
}
