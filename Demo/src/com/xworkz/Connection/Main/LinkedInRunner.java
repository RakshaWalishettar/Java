package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.LinkedIn;
import com.xworkz.Connection.internal.JobPortal;

public class LinkedInRunner {
    public static void main(String[] args) {
        JobPortal jp = new LinkedIn();
        jp.postJob();
        jp.applyJob();
        jp.scheduleInterview();
        jp.fresher();
    }
}
