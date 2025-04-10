package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.AirConditioner;
import com.xworkz.Objects.internal.Ball;

public class BallRunner {
    public static void main(String[] args) {
        Ball ball = new Ball("Nike", 'M', 450);
        System.out.println(ball);

        int code = ball.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: "+System.identityHashCode(ball));
    }
}
