package com.asodc.example.simuduck;

// abstract because you can't have a duck that's not a concrete type of duck
public abstract class Duck {

    // private because subclasses don't need direct access to the fields
    private String name;
    private QuackBehaviour quackBehaviour;
    private FlyBehaviour flyBehaviour;

    // can't have a duck with no name or behaviours
    private Duck() {}

    protected Duck(String name, FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        this.name = name;
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    // all ducks can be displayed, but each duck's display code is unique
    public abstract void display();

    public void performFly() {
        // delegation of fly behaviour to FlyBehaviour object instance
        flyBehaviour.fly();
    }

    public void performQuack() {
        // delegation of quack behaviour to QuackBehaviour object instance
        quackBehaviour.quack();
    }

    // all ducks can swim the same way
    public void swim() {
        // shared swim code for all ducks
    }

    protected String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected FlyBehaviour getFlyBehaviour() {
        return this.flyBehaviour;
    }

    protected void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    protected QuackBehaviour getQuackBehaviour() {
        return this.quackBehaviour;
    }

    protected void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
