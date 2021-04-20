package com.asodc.patterns.observer;

import java.util.Random;

public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;

    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        Random random = new Random();

        System.out.println("===== Forecast Display =====");
        System.out.printf("Temperature: %f\r\n", temperature + random.nextFloat());
        System.out.printf("Humidity: %f\r\n", humidity + random.nextFloat());
        System.out.printf("Pressure: %f\r\n", pressure + random.nextFloat());
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
