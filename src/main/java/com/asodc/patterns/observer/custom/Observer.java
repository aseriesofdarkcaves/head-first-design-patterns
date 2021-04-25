package com.asodc.patterns.observer.custom;

/**
 * This is the Observer from the Observer pattern.
 */
public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
