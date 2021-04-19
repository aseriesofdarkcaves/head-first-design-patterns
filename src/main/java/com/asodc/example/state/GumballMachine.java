package com.asodc.example.state;

public class GumballMachine {
    private State dispenseState;
    private State hasCoinState;
    private State noCoinState;
    private State soldOutState;

    private State state;

    private int gumballCount;

    public GumballMachine(int gumballCount) {
        dispenseState = new DispenseState(this);
        hasCoinState = new HasCoinState(this);
        noCoinState = new NoCoinState(this);
        soldOutState = new SoldOutState(this);

        if (gumballCount >= 1) {
            this.gumballCount = gumballCount;
            state = noCoinState;
        } else {
            this.gumballCount = 0;
            state = soldOutState;
        }
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getGumballCount() {
        return gumballCount;
    }

    public void dispense() {
        gumballCount--;
    }
}
