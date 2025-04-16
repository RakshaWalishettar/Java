package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.Surveillance;

public class CCTV implements Surveillance {
    public void startRecording() {
        System.out.println("CCTV recording started.");
    }

    public void detectMotion() {
        System.out.println("Motion detected by CCTV.");
    }

    public void stopRecording() {
        System.out.println("CCTV recording stopped.");
    }

}
