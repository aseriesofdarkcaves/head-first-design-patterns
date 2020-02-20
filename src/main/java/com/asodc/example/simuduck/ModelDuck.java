package com.asodc.example.simuduck;

public class ModelDuck extends Duck {

    public ModelDuck(String name) {
        super(name, new FlyNoWay(), new Quack());
    }

    public ModelDuck(String name, FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(name, flyBehaviour, quackBehaviour);
    }

    @Override
    public void display() {
        System.out.println("Displaying ModelDuck");
    }
}
