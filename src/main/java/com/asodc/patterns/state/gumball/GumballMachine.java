package com.asodc.patterns.state.gumball;

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
        state.dispense();
    }

    public int getGumballCount() {
        return gumballCount;
    }

    public int getCoinCount() {
        return coinCount;
    }

    @Override
    public String toString() {
        return "MACHINE STATUS: " + gumballCount + " gumball(s), " + coinCount + " coin(s)";
    }

    void depositCoin() {
        coinCount++;
    }

    void dispenseGumball() {
        if (gumballCount <= 0)
            throw new IllegalStateException("an attempt was made to dispense with no gumballs remaining - gumballCount: " + gumballCount);
        else {
            gumballCount--;
        }
    }

    void setState(State state) {
        this.state = state;
    }

    State getSoldState() {
        return soldState;
    }

    State getHasCoinState() {
        return hasCoinState;
    }

    State getNoCoinState() {
        return noCoinState;
    }

    State getSoldOutState() {
        return soldOutState;
    }

    State getState() {
        return state;
    }
}
