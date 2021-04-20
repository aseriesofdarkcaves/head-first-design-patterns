package com.asodc.patterns.strategy.adventure;

public abstract class Character {

    private String name;
    private WeaponBehaviour weapon;

    private Character() {}

    protected Character(String name) {
        this.name = name;
        this.weapon = new UnarmedBehaviour();
    }

    protected Character(String name, WeaponBehaviour weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public void fight() {
        System.out.println(this.toString() + " " + this.getName() + " fights with " + getWeapon().useWeapon() + "!");
    }

    public String getName() {
        return name;
    }

    public WeaponBehaviour getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponBehaviour weapon) {
        this.weapon = weapon;
    }
}
