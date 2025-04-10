package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.Camera;

public class CameraRunner {
    public static void main(String[] args) {
        Camera camera = new Camera("Canon", 'H', 30);
        System.out.println(camera);

        int code = camera.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(camera));
    }
}
