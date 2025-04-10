package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Festival;

public class FestivalRunner {
    public static void main(String[] args) {
        Festival festival = new Festival("SpringFest", 'C', 3);
        System.out.println(festival);

        int code = festival.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(festival));
    }
}
