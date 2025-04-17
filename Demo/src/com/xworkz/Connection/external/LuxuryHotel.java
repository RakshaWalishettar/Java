package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.Hotel;

public class LuxuryHotel implements Hotel {
    public void checkIn() {
        System.out.println("Guest checked in.");
    }

    public void roomService() {
        System.out.println("Room service delivered.");
    }

    public void checkOut() {
        System.out.println("Guest checked out.");
    }
    @Override
    public void stay() {
        System.out.println("Welcome!");
    }
}
