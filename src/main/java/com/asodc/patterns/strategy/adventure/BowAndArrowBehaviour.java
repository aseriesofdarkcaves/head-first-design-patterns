package com.asodc.patterns.strategy.adventure;

public class BowAndArrowBehaviour implements WeaponBehaviour {
    @Override
    public String useWeapon() {
        return "bow and arrow";
    }
}
