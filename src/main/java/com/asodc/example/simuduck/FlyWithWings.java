package com.asodc.example.simuduck;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Using wings to fly!");
    }
}