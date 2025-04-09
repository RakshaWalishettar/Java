package com.xworkz.Objects.internal;

public class WeatherStation {
    private String name;
    private char region;
    private int sensors;

    public WeatherStation(String name, char region, int sensors) {
        this.name = name;
        this.region = region;
        this.sensors = sensors;
    }

    @Override
    public String toString() {
        return "WeatherStation [name=" + name + ", region=" + region + ", sensors=" + sensors + "]";
    }
}
