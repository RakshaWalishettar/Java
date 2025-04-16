package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.RideService;

public class Uber implements RideService {
        public void bookRide() {
            System.out.println("Uber ride booked.");
        }
        public void trackRide() {
            System.out.println("Tracking your Uber...");
        }
        public void cancelRide() {
            System.out.println("Uber ride cancelled.");
        }
}
