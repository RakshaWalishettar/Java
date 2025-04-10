package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.WeatherStation;

public class WeatherStationRunner {
    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation("SkyWatch", 'N', 12);
        System.out.println(ws);

        int code = ws.hashCode(); // Get the hash code from the object
        System.out.println("HashCode: " + code);
        System.out.println("Original identityHashCode: " + System.identityHashCode(ws));
    }
}
