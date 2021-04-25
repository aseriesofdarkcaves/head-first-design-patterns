package com.asodc.patterns.observer.java;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;

    private Observable weatherData;

    public CurrentConditionsDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        this.weatherData.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        // because we're using the PULL model, we work with the Observable object that has changed
        WeatherData weatherData = (WeatherData) o;

        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();

        display();
    }

    @Override
    public void display() {
        System.out.println("===== Current Conditions Display =====");
        System.out.printf("Temperature: %f\r\n", temperature);
        System.out.printf("Humidity: %f\r\n", humidity);
        System.out.printf("Pressure: %f\r\n", pressure);
    }
}
