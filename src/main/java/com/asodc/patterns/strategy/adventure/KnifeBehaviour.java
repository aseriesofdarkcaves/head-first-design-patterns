package com.asodc.patterns.strategy.adventure;

public class KnifeBehaviour implements WeaponBehaviour {
    @Override
    public String useWeapon() {
        return "knife";
    }
}
