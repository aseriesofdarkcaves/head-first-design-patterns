package com.asodc.example.simuduck;

public class RubberDuck extends Duck {

    public RubberDuck(String name) {
        super(name, new FlyNoWay(), new Squeak());
    }

    public RubberDuck(String name, FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(name, flyBehaviour, quackBehaviour);
    }

    @Override
    public void display() {
        // looks like a rubber duck
    }
}