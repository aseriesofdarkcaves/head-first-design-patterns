package com.asodc.example.weather.impl1;

public class WeatherStation {
    public static void main(String... args) throws InterruptedException {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(19.2f, 35.3f, 30.4f);
        Thread.sleep(3000);
        weatherData.setMeasurements(19.8f, 37.8f, 29.8f);
        Thread.sleep(3000);
        weatherData.setMeasurements(19.3f, 36.5f, 30.3f);
    }
}