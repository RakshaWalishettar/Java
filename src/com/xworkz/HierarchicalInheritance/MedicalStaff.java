package com.xworkz.HierarchicalInheritance;

public class MedicalStaff {
    void attendPatient() {
        System.out.println("Medical staff attends to the patient");
    }
}

class Doctor extends MedicalStaff {
    void prescribeMedicine() {
        System.out.println("Doctor prescribes medicine");
    }
}

class Nurse extends MedicalStaff {
    void giveInjection() {
        System.out.println("Nurse gives an injection");
    }

    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.attendPatient();
        doc.prescribeMedicine();

        Nurse nurse = new Nurse();
        nurse.attendPatient();
        nurse.giveInjection();
    }
}
