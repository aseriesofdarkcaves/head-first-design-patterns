package com.asodc.patterns.observer.java;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;

    private Observable weatherData;

    public ForecastDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        this.weatherData.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        WeatherData weatherData = (WeatherData) o;

        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();

        display();
    }

    @Override
    public void display() {
        Random random = new Random();

        System.out.println("===== Forecast Display =====");
        System.out.printf("Temperature: %f\r\n", temperature + random.nextFloat());
        System.out.printf("Humidity: %f\r\n", humidity + random.nextFloat());
        System.out.printf("Pressure: %f\r\n", pressure + random.nextFloat());
    }
}
