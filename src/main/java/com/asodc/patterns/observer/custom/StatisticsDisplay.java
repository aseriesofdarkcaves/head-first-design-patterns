package com.asodc.patterns.observer.custom;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float averageTemperature;
    private float averageHumidity;
    private float averagePressure;

    private Subject weatherData;

    private int updateCount = 0;

    private float temperatureSum;
    private float humiditySum;
    private float pressureSum;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("===== Statistics Display =====");
        System.out.printf("Average temperature: %f\r\n", averageTemperature);
        System.out.printf("Average humidity: %f\r\n", averageHumidity);
        System.out.printf("Average pressure: %f\r\n", averagePressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        updateCount++;

        temperatureSum += temperature;
        averageTemperature = (temperatureSum) / updateCount;

        humiditySum += humidity;
        averageHumidity = (humiditySum) / updateCount;

        pressureSum += pressure;
        averagePressure = (pressureSum) / updateCount;

        display();
    }
}
