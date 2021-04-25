package com.asodc.patterns.observer.java;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    // default constructor

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        setChanged();
        // because the displays will PULL the data from the Observable (this Object),
        // no argument is supplied to notifyObservers()
        notifyObservers();
    }
}
