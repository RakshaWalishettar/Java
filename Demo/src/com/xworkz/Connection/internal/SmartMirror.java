package com.xworkz.Connection.internal;

public interface SmartMirror {
    void showTime();
    void displayNews();
    void displayWeather();
    default void sensitative() {
        System.out.println("Welcome!");
    }
}
