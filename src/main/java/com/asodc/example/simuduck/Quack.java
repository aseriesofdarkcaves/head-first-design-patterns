package com.asodc.example.simuduck;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
