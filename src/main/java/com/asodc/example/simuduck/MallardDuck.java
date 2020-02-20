package com.asodc.example.simuduck;

public class MallardDuck extends Duck {

    public MallardDuck(String name) {
        super(name, new FlyWithWings(), new Quack());
    }

    public MallardDuck(String name, FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(name, flyBehaviour, quackBehaviour);
    }

    @Override
    public void display() {
        // looks like a mallard
    }
}
