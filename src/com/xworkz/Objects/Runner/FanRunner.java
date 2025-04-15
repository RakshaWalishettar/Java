package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Fan;

public class FanRunner {
    public static void main(String[] args) {
        Fan f = new Fan("Usha", 5, true);
        Fan f1=new Fan("Usha",5,false);
        System.out.println(f);
        System.out.println("the fan has:"+(f==f1));
        boolean same=f.equals(f1);
        System.out.println("both fan1 and fan2 are same :"+same);


        int code = f.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(f));
    }
}
