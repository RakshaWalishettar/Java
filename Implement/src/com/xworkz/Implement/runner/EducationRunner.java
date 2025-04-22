package com.xworkz.Implement.runner;

import com.xworkz.Implement.external.School;
import com.xworkz.Implement.internal.CBSESchool;
import com.xworkz.Implement.internal.EducationBoarding;

public class EducationRunner {
    public static void main(String[] args) {
        EducationBoarding educationBoarding=new CBSESchool();
        System.out.println("the student is in cbse board");
        CBSESchool cbseSchool=new CBSESchool();
        School school=new School(educationBoarding);
        educationBoarding.syllabus();
    }
}
