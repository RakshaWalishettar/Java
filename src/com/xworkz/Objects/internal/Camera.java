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
    public String toString() {
        return "Camera [brand=" + brand + ", resolution=" + resolution + ", zoom=" + zoom + "]";
    }
    @Override
    public int hashCode() {
        System.out.println("Default hash code: " +super.hashCode());
        return 24;
    }

}
