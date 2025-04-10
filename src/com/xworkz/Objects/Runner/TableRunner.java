package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Table;

public class TableRunner {
    public static void main(String[] args) {
        Table t = new Table("Dining", 'L', 500);
        System.out.println(t);

        int code = t.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(t));
    }
}
