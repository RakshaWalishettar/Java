package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.LuxuryHotel;
import com.xworkz.Connection.internal.Hotel;

public class LuxuryHotelRunner {
    public static void main(String[] args) {
        Hotel hotel = new LuxuryHotel();
        hotel.checkIn();
        hotel.roomService();
        hotel.checkOut();
        hotel.stay();
    }
}
