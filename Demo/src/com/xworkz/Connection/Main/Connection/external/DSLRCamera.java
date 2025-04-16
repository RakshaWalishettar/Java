package com.xworkz.Connection.Main.Connection.external;

import com.xworkz.Connection.internal.Camera;

public class DSLRCamera implements Camera {
    public void capturePhoto() {
        System.out.println("Photo captured with DSLR.");
    }
    public void recordVideo() {
        System.out.println("Recording video with DSLR...");
    }
    public void switchMode() {
        System.out.println("Switched from photo to video mode.");
    }
}
