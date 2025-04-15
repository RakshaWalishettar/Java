package com.xworkz.SingleInheritance.Runner;

import com.xworkz.SingleInheritance.external.OnlineCourse;

public class OnlineCourseRunner {
    public static void main(String[] args) {
        OnlineCourse oc = new OnlineCourse();
        oc.enroll();
        oc.streamVideo();
    }
}
