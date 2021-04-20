package com.asodc.patterns.strategy.simuduck;

/**
 * Class created for the Brain Power challenge on page 23
 */
public class DuckCallDevice {

    private QuackBehaviour quackBehaviour;

    public DuckCallDevice() {
        this.quackBehaviour = new Quack();
    }

    public DuckCallDevice(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public QuackBehaviour getQuackBehaviour() {
        return quackBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
