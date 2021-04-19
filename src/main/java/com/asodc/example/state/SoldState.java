package com.asodc.example.state;

public class SoldState implements State {
    private GumballMachine machine;

    public SoldState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void receiveCoin() {
        System.out.println("CANNOT INSERT COIN, CURRENTLY DISPENSING!");
    }

    @Override
    public void ejectCoin() {
        System.out.println("CANNOT EJECT COIN, CURRENTLY DISPENSING!");
    }

    @Override
    public void turnCrank() {
        System.out.println("CANNOT TURN CRANK, CURRENTLY DISPENSING!");
    }

    @Override
    public void dispense() {
        if (machine.getGumballCount() <= 0)
            machine.setState(machine.getSoldOutState());
        else
            machine.setState(machine.getNoCoinState());
    }
}
