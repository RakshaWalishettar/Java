package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Bridge;

public class BridgeRunner {
    public static void main(String[] args) {
        Bridge bridge1 = new Bridge("GoldenGate", 'S', 2737);
        Bridge bridge2=new Bridge("GoldenGate",'y',82);
        System.out.println("the bridge has:"+(bridge1==bridge2));
        boolean same=bridge1.equals(bridge2);
        System.out.println("both bridge1 and bridge2 are same :"+same);

        System.out.println(bridge1);

        int code = bridge1.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(bridge1));
    }
}
