package com.xworkz.Connection.Main;

import com.xworkz.Connection.external.AccuWeather;
import com.xworkz.Connection.internal.WeatherApp;

public class AccuWeatherRunner {
    public static void main(String[] args) {
        WeatherApp weather = new AccuWeather();
        weather.fetchTemperature();
        weather.fetchHumidity();
        weather.showForecast();
    }
}
