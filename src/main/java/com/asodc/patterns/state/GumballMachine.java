package com.asodc.patterns.state;

public class GumballMachine {
    private State soldState;
    private State hasCoinState;
    private State noCoinState;
    private State soldOutState;

    private State state;

    private int gumballCount;
    private int coinCount;

    public GumballMachine(int gumballCount) {
        soldState = new SoldState(this);
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

    public void receiveCoin() {
        state.receiveCoin();
    }

    public void ejectCoin() {
        state.ejectCoin();
    }

    public void turnCrank() {
        state.turnCrank();
        // TODO: this is a bug - depositing and dispensing should depend on the current state
        depositCoin();
        dispenseGumball();
    }

    private void dispenseGumball() {
        if (gumballCount <= 0)
            throw new IllegalStateException("an attempt was made to dispense with no gumballs remaining - gumballCount: " + gumballCount);
        else {
            System.out.println("DISPENSING GUMBALL!");
            state.dispense();
            gumballCount--;
        }
    }

    public int getGumballCount() {
        return gumballCount;
    }

    public int getCoinCount() {
        return coinCount;
    }

    private void depositCoin() {
        coinCount++;
    }

    public State getSoldState() {
        return soldState;
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

    @Override
    public String toString() {
        return "MACHINE STATUS: " + gumballCount + " gumball(s), " + coinCount + " coin(s)";
    }

    public State getState() {
        return state;
    }
}
