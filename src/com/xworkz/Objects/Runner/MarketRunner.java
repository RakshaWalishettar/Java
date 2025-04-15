package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Mango;
import com.xworkz.Objects.internal.Market;

public class MarketRunner {
    public static void main(String[] args) {
        Market m = new Market("FreshMart", 'F', 100);
        Market market= new Market("FreshMart",'F',863);
        System.out.println(m);

        System.out.println("the farm has:"+(m==market));
        boolean same=m.equals(market);
        System.out.println("both farm and farm1 are same :"+same);

        int code = m.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(m));
    }
}
