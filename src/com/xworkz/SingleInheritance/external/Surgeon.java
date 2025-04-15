package com.xworkz.SingleInheritance.external;

import com.xworkz.SingleInheritance.internal.Doctor;

public class Surgeon extends Doctor {
    public void performSurgery() {
        System.out.println("Surgeon is performing surgery");
    }
}
