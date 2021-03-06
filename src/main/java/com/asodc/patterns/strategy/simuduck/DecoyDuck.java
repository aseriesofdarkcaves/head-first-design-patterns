package com.asodc.patterns.strategy.simuduck;

public class DecoyDuck extends Duck {

    public DecoyDuck(String name) {
        super(name, new FlyNoWay(), new MuteQuack());
    }

    public DecoyDuck(String name, FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(name, flyBehaviour, quackBehaviour);
    }

    @Override
    public void display() {
        System.out.println("Displaying DecoyDuck");
    }
}
