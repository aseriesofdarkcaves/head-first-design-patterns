package com.asodc.patterns.state.gumball;

public class NoCoinState implements State {
    private GumballMachine machine;

    public NoCoinState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void receiveCoin() {
        System.out.println("COIN INSERTED!");
        machine.setState(machine.getHasCoinState());
    }

    @Override
    public void ejectCoin() {
        System.out.println("NO COIN TO EJECT!");
    }

    @Override
    public void turnCrank() {
        System.out.println("CANNOT TURN CRANK, INSERT COIN FIRST!");
    }

    @Override
    public void dispense() {
        System.out.println("CANNOT DISPENSE, INSERT COIN FIRST!");
    }
}
