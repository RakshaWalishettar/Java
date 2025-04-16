package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.BloodTestLab;
import com.xworkz.Connection.internal.Laboratory;

public class BloodTestLabRunner {
    public static void main(String[] args) {
        Laboratory lab = new BloodTestLab();
        lab.collectSample();
        lab.testSample();
        lab.generateReport();
    }
}
