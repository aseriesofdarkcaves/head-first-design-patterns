package com.asodc.patterns.observer.custom;

public interface Subject {
    // all fields in an interface have to be public static final fields - i.e. constants
    // all methods in an interface are implicitly public (in java 8 anyway)
    // it's recommended to omit the public modifier for both fields and methods
    // even though it could be confused with package-private, but that's java for you

    void registerObserver(Observer oberver);

    void removeObserver(Observer observer);

    void notifyObservers();
}
