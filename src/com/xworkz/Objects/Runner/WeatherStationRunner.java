package com.xworkz.Objects.Runner;

import com.xworkz.Objects.internal.WeatherStation;

public class WeatherStationRunner {
    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation("SkyWatch", 'N', 12);
        System.out.println(ws);
    }
}
