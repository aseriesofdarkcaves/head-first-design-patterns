package com.asodc.patterns.strategy.adventure;

public class UnarmedBehaviour implements WeaponBehaviour {
    @Override
    public String useWeapon() {
        return "fists";
    }
}
