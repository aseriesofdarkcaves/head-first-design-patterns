package com.asodc.example.state;

public interface State {
    void receiveCoin();

    void ejectCoin();

    void turnCrank();

    void dispense();
}
