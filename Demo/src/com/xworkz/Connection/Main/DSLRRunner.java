package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.DSLRCamera;
import com.xworkz.Connection.internal.Camera;

public class DSLRRunner {
    public static void main(String[] args) {
        Camera cam = new DSLRCamera();
        cam.capturePhoto();
        cam.recordVideo();
        cam.switchMode();
        cam.reel();
    }
}
