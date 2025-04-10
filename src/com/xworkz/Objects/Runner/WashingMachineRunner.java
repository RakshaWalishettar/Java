package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.WashingMachine;

public class WashingMachineRunner {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine("Samsung", 'T', 7);
        System.out.println(wm);

        int code = wm.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(wm));
    }
}
