package com.asodc.patterns.observer.custom;

public class WeatherStation {
    public static void main(String... args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(19.2f, 35.3f, 30.4f);
        System.out.println();
        weatherData.setMeasurements(19.8f, 37.8f, 29.8f);
        System.out.println();
        weatherData.setMeasurements(19.3f, 36.5f, 30.3f);
        System.out.println();
    }
}
