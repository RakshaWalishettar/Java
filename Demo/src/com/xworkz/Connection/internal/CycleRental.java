package com.xworkz.Connection.internal;

public interface CycleRental {
    void unlockBike();
    void rideBike();
    void lockBike();
    default void greatUser() {
        System.out.println("Welcome, how  can i help.");
    }
}
