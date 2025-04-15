package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Calender;



public class CalenderRunner {
    public static void main(String[] args) {
        Calender calender1 = new Calender("2025", 'W', 12);
        Calender calender2=new Calender("2025",'M',14);
        System.out.println(calender1);

        System.out.println("the calander has:"+(calender1==calender2));
        boolean same=calender1.equals(calender2);
        System.out.println("both calander1 and calander2 are same :"+same);


        int code = calender1.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(calender1));
    }
}
