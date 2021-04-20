package com.asodc.patterns.strategy.simuduck;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Can't fly!");
    }
}
