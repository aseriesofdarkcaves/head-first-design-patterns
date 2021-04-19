package com.asodc.example.state;

public class GumballMachineSim {
    public static void main(String... args) {
        GumballMachine machine = new GumballMachine(10);
        printMachineStatus(machine);

        machine.receiveCoin();
        machine.turnCrank();
        printMachineStatus(machine);
    }

    private static void printMachineStatus(GumballMachine machine) {
        System.out.println(machine.toString());
    }
}
