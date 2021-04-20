package com.asodc.patterns.state;

public class SoldOutState implements State {
    private GumballMachine machine;

    public SoldOutState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void receiveCoin() {
        System.out.println("CANNOT INSERT COIN, SOLD OUT!");
    }

    @Override
    public void ejectCoin() {
        System.out.println("NO COIN TO EJECT!");
    }

    @Override
    public void turnCrank() {
        System.out.println("CANNOT TURN CRANK, SOLD OUT!");
    }

    @Override
    public void dispense() {
        System.out.println("CANNOT DISPENSE, SOLD OUT!");
    }
}
