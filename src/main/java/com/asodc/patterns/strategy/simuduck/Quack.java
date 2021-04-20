package com.asodc.patterns.strategy.simuduck;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
