package com.asodc.patterns.strategy.adventure;

public class AxeBehaviour implements WeaponBehaviour {
    @Override
    public String useWeapon() {
        return "axe";
    }
}
