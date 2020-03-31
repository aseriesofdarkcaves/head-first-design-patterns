package com.asodc.example.weather.impl1;

/**
 * This is the Observer from the Observer pattern.
 */
public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
