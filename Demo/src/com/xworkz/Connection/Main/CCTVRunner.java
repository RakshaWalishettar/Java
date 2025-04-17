package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.CCTV;
import com.xworkz.Connection.internal.Surveillance;

public class CCTVRunner {
    public static void main(String[] args) {
        Surveillance cam = new CCTV();
        cam.startRecording();
        cam.detectMotion();
        cam.stopRecording();
        cam.greetUser();
    }
}
