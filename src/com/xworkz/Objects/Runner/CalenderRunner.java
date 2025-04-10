package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Calender;



public class CalenderRunner {
    public static void main(String[] args) {
        Calender calender = new Calender("2025", 'W', 12);
        System.out.println(calender);

        int code = calender.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(calender));
    }
}
