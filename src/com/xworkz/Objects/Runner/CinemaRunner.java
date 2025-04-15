package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Cinema;

public class CinemaRunner {
    public static void main(String[] args) {
        Cinema cinema1 = new Cinema("CineMax", 'B', 20);
        Cinema cinema2=new Cinema("CineMax",'C',56);

        System.out.println("the cinema has:"+(cinema1==cinema2));
        boolean same=cinema1.equals(cinema2);
        System.out.println("both cinema1 and cinema2 are same :"+same);


        int code = cinema1.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(cinema1));
    }
}
