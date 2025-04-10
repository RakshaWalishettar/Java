package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.WhiteBoard;

public class WhitBoardRunner {
    public static void main(String[] args) {
        WhiteBoard w = new WhiteBoard("Medium", 'S', 1500);
        System.out.println(w);

        int code = w.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(w));
    }
}
