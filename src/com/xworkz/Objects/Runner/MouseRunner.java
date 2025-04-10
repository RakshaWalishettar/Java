package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Mouse;

public class MouseRunner {
    public static void main(String[] args) {
        Mouse m = new Mouse("Logitech", 'H', 799);
        System.out.println(m);

        int code = m.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(m));
    }
}
