package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.Rapido;
import com.xworkz.Connection.internal.RideSharing;

public class RapidoRunner {
    public static void main(String[] args) {
        RideSharing ride = new Rapido();
        ride.bookRide();
        ride.startRide();
        ride.endRide();
    }
}
