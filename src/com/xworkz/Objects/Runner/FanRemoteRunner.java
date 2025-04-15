package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.FanRemote;

public class FanRemoteRunner {
    public static void main(String[] args) {
        FanRemote fan = new FanRemote("Orient", 'S', 5);
        FanRemote fan1=new FanRemote("Orient",'S',6);
        System.out.println(fan);

        System.out.println("the fan has:"+(fan==fan1));
        boolean same=fan.equals(fan1);
        System.out.println("both fan and fan1 are same :"+same);

        int code = fan.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(fan));
    }
}
