package com.asodc.example.weather.impl1;

public class WeatherStation {
    public static void main(String... args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setTemperature(19.2f);
        weatherData.setHumidity(35.3f);
        weatherData.setPressure(29.2f);

        weatherData.notifyObservers();
    }
}
