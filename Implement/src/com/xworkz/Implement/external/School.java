package com.xworkz.Implement.external;

import com.xworkz.Implement.internal.EducationBoarding;

public class School {
    private EducationBoarding educationBoarding;

    public School(EducationBoarding educationBoarding){
        this.educationBoarding=educationBoarding;
        System.out.println("the cbse is the boarding");
    }
    public void students(){
        System.out.println("the students are educated");
        if(this.educationBoarding!=null){
            this.educationBoarding.syllabus();
        }
        else {
            System.out.println("not educated");
        }
    }
}
