package com.asodc.patterns.state.gumball;

public interface State {
    void receiveCoin();

    void ejectCoin();

    void turnCrank();

    void dispense();
}
