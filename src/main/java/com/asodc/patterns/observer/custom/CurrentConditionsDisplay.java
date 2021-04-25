package com.asodc.patterns.observer.custom;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;

    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("===== Current Conditions Display =====");
        System.out.printf("Temperature: %f\r\n", temperature);
        System.out.printf("Humidity: %f\r\n", humidity);
        System.out.printf("Pressure: %f\r\n", pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
