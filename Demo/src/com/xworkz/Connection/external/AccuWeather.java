package com.xworkz.Connection.external;

import com.xworkz.Connection.internal.WeatherApp;

public class AccuWeather implements WeatherApp {
    public void fetchTemperature() {
        System.out.println("Temperature fetched from AccuWeather.");
    }

    public void fetchHumidity() {
        System.out.println("Humidity fetched from AccuWeather.");
    }

    public void showForecast() {
        System.out.println("Showing forecast from AccuWeather.");
    }

}
