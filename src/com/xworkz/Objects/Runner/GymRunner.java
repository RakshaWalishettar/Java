package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Gym;

public class GymRunner {
    public static void main(String[] args) {
        Gym gym = new Gym("FitZone", 'P', 15);
        System.out.println(gym);

        int code = gym.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(gym));
    }
}
