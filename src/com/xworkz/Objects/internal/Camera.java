package com.xworkz.Objects.internal;

public class Camera {
    private String brand;
    private char resolution;
    private int zoom;

    public Camera(String brand, char resolution, int zoom) {
        this.brand = brand;
        this.resolution = resolution;
        this.zoom = zoom;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Reference is not null");
            if (obj instanceof Camera) {
                System.out.println("Object is an instance of Camera");
                Camera other = (Camera) obj;
                if (this.brand.equals(other.brand)) {
                    System.out.println("Both camera are the same");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Camera [brand=" + brand + ", resolution=" + resolution + ", zoom=" + zoom + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 24;
    }

}
