package com.asodc.patterns.strategy.simuduck;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Flying with wings!");
    }
}
