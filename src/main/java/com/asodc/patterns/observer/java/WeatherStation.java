package com.asodc.patterns.observer.java;

public class WeatherStation {
    public static void main(String... args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(19.3f, 12.5f, 85.8f);
    }
}
