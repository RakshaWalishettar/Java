package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.CityBike;
import com.xworkz.Connection.internal.CycleRental;

public class CityBikeRunner {
    public static void main(String[] args) {
        CycleRental bike = new CityBike();
        bike.unlockBike();
        bike.rideBike();
        bike.lockBike();
        bike.greatUser();
    }
}
