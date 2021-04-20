package com.asodc.patterns.strategy.simuduck;

public class RedheadDuck extends Duck {

    public RedheadDuck(String name) {
        super(name, new FlyWithWings(), new Quack());
    }

    public RedheadDuck(String name, FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(name, flyBehaviour, quackBehaviour);
    }

    @Override
    public void display() {
        System.out.println("Displaying RedheadDuck");
    }
}
