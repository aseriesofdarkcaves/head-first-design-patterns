package com.asodc.patterns.state;

import com.asodc.patterns.state.gumball.GumballMachine;

public class GumballMachineSim {
    private static GumballMachine machine;

    public static void main(String... args) {
        machine = new GumballMachine(10);
        printMachineStatus();

        machine.receiveCoin();
        machine.turnCrank();
        printMachineStatus();

        machine.receiveCoin();
        machine.ejectCoin();
        printMachineStatus();

        machine.ejectCoin();
        printMachineStatus();

        machine.turnCrank();
        printMachineStatus();
    }

    private static void printMachineStatus() {
        System.out.println(machine.toString() + "\r\n");
    }
}
