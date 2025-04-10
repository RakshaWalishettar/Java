package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.TableLamp;

public class TableLampRunner {
    public static void main(String[] args) {
        TableLamp l = new TableLamp("White", 'M', 30);
        System.out.println(l);

        int code = l.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(l));
    }
}
