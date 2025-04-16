package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.EngineeringCollege;
import com.xworkz.Connection.internal.University;

public class EngineeringCollegeRunner {
    public static void main(String[] args) {
        University u = new EngineeringCollege();
        u.enrollStudent();
        u.conductExam();
        u.declareResults();
    }
}
