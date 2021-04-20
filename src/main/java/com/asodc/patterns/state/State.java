package com.asodc.patterns.state;

public interface State {
    void receiveCoin();

    void ejectCoin();

    void turnCrank();

    void dispense();
}
