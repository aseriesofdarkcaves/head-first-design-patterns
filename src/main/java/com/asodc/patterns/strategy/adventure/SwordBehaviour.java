package com.asodc.patterns.strategy.adventure;

public class SwordBehaviour implements WeaponBehaviour {
    @Override
    public String useWeapon() {
        return "sword";
    }
}
