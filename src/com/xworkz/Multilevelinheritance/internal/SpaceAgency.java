package com.xworkz.Multilevelinheritance.internal;

public class SpaceAgency {
    void launchRocket() {
        System.out.println("Launching a rocket into space");
    }
}

class Satellite extends SpaceAgency {
    void collectData() {
        System.out.println("Satellite is collecting data from orbit");
    }
}

class WeatherSatellite extends Satellite {
    void predictWeather() {
        System.out.println("Predicting weather using satellite data");
    }

    public static void main(String[] args) {
        WeatherSatellite ws = new WeatherSatellite();
        ws.launchRocket();
        ws.collectData();
        ws.predictWeather();
    }
}
