package com.xworkz.Inheritance.external.Runner;

import com.xworks.Inheritance.external.Course;
import com.xworks.Inheritance.external.Onlinecourse;

public class OCRunner {
    public static void main(String[] args){
        Course course=new Course();
        course.getCertificate();
        course.enroll();
        course.startCourse();
        course.completeCourse();
        course.reviewCourse();

        System.out.println("==========================");
        Onlinecourse onlinecourse=new Onlinecourse();
        onlinecourse.getCertificate();
        onlinecourse.enroll();
        onlinecourse.startCourse();
        onlinecourse.completeCourse();
        onlinecourse.reviewCourse();
    }
}
