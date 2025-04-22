package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.Detector;

public class DetectionService {
    private Detector detector;
    public DetectionService(Detector detector) {
        this.detector = detector;
        System.out.println("DetectionService initialized");
    }
    public void execute() {
        System.out.println("Running detection...");
        if (this.detector != null) {
            this.detector.detect();
        } else {
            System.out.println("not detected");
        }
    }
}
