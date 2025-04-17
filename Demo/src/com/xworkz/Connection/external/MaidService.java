package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.CleaningService;

public class MaidService implements CleaningService {
    public void sweep() {
        System.out.println("Sweeping the floor.");
    }
    public void mop() {
        System.out.println("Mopping the floor.");
    }
    public void dust() {
        System.out.println("Dusting the furniture.");
    }
    @Override
    public void paid() {
        System.out.println("Welcome!");
    }
}
