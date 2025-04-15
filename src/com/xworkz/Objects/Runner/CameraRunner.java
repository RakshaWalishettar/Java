package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Camera;

public class CameraRunner {
    public static void main(String[] args) {
        Camera camera1 = new Camera("Canon", 'H', 30);
        Camera camera2=new Camera("Canon",'J',60);
        System.out.println(camera1);

        System.out.println("the Camera has:"+(camera1==camera2));
        boolean same=camera1.equals(camera2);
        System.out.println("both camera1 and camera2 are same :"+same);



        int code = camera1.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(camera1));
    }
}
