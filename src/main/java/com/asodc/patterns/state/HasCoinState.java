package com.asodc.patterns.state;

public class HasCoinState implements State {
    private GumballMachine machine;

    public HasCoinState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void receiveCoin() {
        System.out.println("CANNOT INSERT COIN, COIN ALREADY INSERTED!");
    }

    @Override
    public void ejectCoin() {
        System.out.println("EJECTING COIN!");
        machine.setState(machine.getNoCoinState());
    }

    @Override
    public void turnCrank() {
        if (machine.getGumballCount() <= 0) {
            System.out.println("CANNOT TURN CRANK, SOLD OUT!");
            machine.setState(machine.getSoldOutState());
        } else {
            System.out.println("TURNING CRANK!");
            machine.setState(machine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("CANNOT DISPENSE, TURN CRANK FIRST!");
    }
}
