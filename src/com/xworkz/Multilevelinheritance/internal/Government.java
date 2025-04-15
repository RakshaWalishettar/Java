package com.xworkz.Multilevelinheritance.internal;

public class Government {
    void makeLaw() {
        System.out.println("Government makes laws");
    }
}

class PoliceDepartment extends Government {
    void enforceLaw() {
        System.out.println("Police department enforces the law");
    }
}

class CyberCrimeUnit extends PoliceDepartment {
    void investigateCyberCrime() {
        System.out.println("Cyber Crime Unit investigates online crimes");
    }

    public static void main(String[] args) {
        CyberCrimeUnit unit = new CyberCrimeUnit();
        unit.makeLaw();
        unit.enforceLaw();
        unit.investigateCyberCrime();
    }
}
