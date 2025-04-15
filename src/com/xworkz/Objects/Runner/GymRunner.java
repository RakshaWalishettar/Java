package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Gym;

public class GymRunner {
    public static void main(String[] args) {
        Gym gym = new Gym("FitZone", 'P', 15);
        Gym gym1=new Gym("FitZone",'P',63);
        System.out.println(gym);
        System.out.println("the gym has:"+(gym==gym1));
        boolean same=gym.equals(gym1);
        System.out.println("both gym and gym1 are same :"+same);


        int code = gym.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(gym));
    }
}
