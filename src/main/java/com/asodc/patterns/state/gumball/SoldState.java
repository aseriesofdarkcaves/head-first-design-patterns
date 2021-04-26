package com.asodc.patterns.state.gumball;

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
        if (machine.getGumballCount() <= 0) {
            System.out.println("CANNOT DISPENSE, SOLD OUT!");
            machine.setState(machine.getSoldOutState());
        }
        else {
            System.out.println("DISPENSING GUMBALL!");
            machine.depositCoin();
            machine.dispenseGumball();
            machine.setState(machine.getNoCoinState());
        }
    }
}
