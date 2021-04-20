package com.asodc.patterns.observer;

/**
 * This is the Observer from the Observer pattern.
 */
public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
