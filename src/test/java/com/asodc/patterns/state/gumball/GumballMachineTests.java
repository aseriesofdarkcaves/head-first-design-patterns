package com.asodc.patterns.state.gumball;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class GumballMachineTests {
    private GumballMachine machine;

    private static final String INCORRECT_STATE_MESSAGE = "Machine isn't in the correct state";

    @BeforeEach
    public void initGumballMachine() {
        machine = new GumballMachine(10);
    }

    @Test
    public void initialState() {
        Assertions.assertInstanceOf(NoCoinState.class, machine.getState(), INCORRECT_STATE_MESSAGE);
    }

    @Test
    public void insertCoin() {
        machine.receiveCoin();
        Assertions.assertInstanceOf(HasCoinState.class, machine.getState(), INCORRECT_STATE_MESSAGE);
    }

    @Test
    public void ejectCoin() {
        machine.receiveCoin();
        machine.ejectCoin();
        assertInstanceOf(NoCoinState.class, machine.getState(), INCORRECT_STATE_MESSAGE);
    }

    @Test
    public void turnCrank() {
        machine.receiveCoin();
        machine.turnCrank();
        assertInstanceOf(NoCoinState.class, machine.getState(), INCORRECT_STATE_MESSAGE);
    }

    @Test
    public void normalTransaction() {
        machine.receiveCoin();
        machine.turnCrank();

        assertEquals(9, machine.getGumballCount(), "Incorrect amount of gumballs left");
        assertEquals(1, machine.getCoinCount(), "Incorrect amount of coins in machine");
        assertInstanceOf(NoCoinState.class, machine.getState(), "Machine isn't in the correct state");
    }

    @Test
    public void insertAndEjectCoin() {
        machine.receiveCoin();
        machine.ejectCoin();

        assertEquals(10, machine.getGumballCount(), "Incorrect amount of gumballs left");
        assertEquals(0, machine.getCoinCount(), "Incorrect amount of coins in machine");
        assertInstanceOf(NoCoinState.class, machine.getState(), "Machine isn't in the correct state");
    }
}
