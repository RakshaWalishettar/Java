package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Rama;

public class RamaRunner {
        public static void main(String[] args) {
            Rama r =  new Rama(18, "Rama", "Sunshine Public School");
            System.out.println(r);

            int code = r.hashCode(); // Get the hash code from the object
            System.out.println("HashCode: " + code);
            System.out.println("Original identityHashCode: " + System.identityHashCode(r));
        }
}
