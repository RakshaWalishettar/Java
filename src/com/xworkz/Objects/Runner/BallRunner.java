package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.AirConditioner;
import com.xworkz.Objects.internal.Ball;

public class BallRunner {
    public static void main(String[] args) {
        Ball ball1= new Ball("leather", 'M', 450);
        Ball ball2=new Ball("leather",'S',15);

        System.out.println("the ball has:"+(ball1==ball2));
        boolean same=ball1.equals(ball2);
        System.out.println("both ball1 and ball2 are same :"+same);


        int code = ball1.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: "+System.identityHashCode(ball1));
    }
}
