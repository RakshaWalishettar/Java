package com.xworkz.Objects.internal;

public class Factory {
    private String name;
    private char productType;
    private int workers;

    public Factory(String name, char productType, int workers) {
        this.name = name;
        this.productType = productType;
        this.workers = workers;
    }

    @Override
    public String toString() {
        return "Factory [name=" + name + ", productType=" + productType + ", workers=" + workers + "]";
    }
}
