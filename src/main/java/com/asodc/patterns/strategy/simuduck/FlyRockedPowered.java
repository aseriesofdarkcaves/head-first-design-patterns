package com.asodc.patterns.strategy.simuduck;

public class FlyRockedPowered implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Flying with a rocket!");
    }
}
