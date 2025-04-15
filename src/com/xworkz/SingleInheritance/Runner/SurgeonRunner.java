package com.xworkz.SingleInheritance.Runner;

import com.xworkz.SingleInheritance.external.Surgeon;

public class SurgeonRunner {
    public static void main(String[] args) {
        Surgeon s = new Surgeon();
        s.diagnose();
        s.performSurgery();
    }
}
