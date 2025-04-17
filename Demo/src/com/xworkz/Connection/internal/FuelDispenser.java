package com.xworkz.Connection.internal;

public interface FuelDispenser {
    void selectFuelType();
    void pumpFuel();
    void stopPumping();
    default void liquid() {
        System.out.println("Welcome!");
    }
}
