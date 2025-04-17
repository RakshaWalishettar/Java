package com.xworkz.Connection.internal;

public interface WeatherApp {
    void fetchTemperature();
    void fetchHumidity();
    void showForecast();
    default void greetUser() {
        System.out.println("Welcome to your weather app!");
    }
}
