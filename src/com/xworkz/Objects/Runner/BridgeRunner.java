package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Bridge;

public class BridgeRunner {
    public static void main(String[] args) {
        Bridge bridge = new Bridge("GoldenGate", 'S', 2737);
        System.out.println(bridge);

        int code = bridge.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(bridge));
    }
}
