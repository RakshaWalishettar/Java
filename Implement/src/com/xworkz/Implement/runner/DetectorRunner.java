package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.DetectionService;
import com.xworkz.Implement.internal.Detector;
import com.xworkz.Implement.internal.FaceDetector;

public class DetectorRunner {
    public static void main(String[] args) {
        Detector detector = new FaceDetector();
        DetectionService service = new DetectionService(detector);
        service.execute();
    }
}
