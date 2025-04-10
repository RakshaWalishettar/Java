package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Market;

public class MarketRunner {
    public static void main(String[] args) {
        Market m = new Market("FreshMart", 'F', 100);
        System.out.println(m);

        int code = m.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(m));
    }
}
