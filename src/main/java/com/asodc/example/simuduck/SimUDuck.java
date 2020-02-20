package com.asodc.example.simuduck;

public class SimUDuck {

    public static void main(String... args) {
        // Default Mallard Duck
        Duck defaultMallardDuck = new MallardDuck("Kevin");
        String defaultMallardDuckName = defaultMallardDuck.getName();
        FlyBehaviour defaultMallardDuckFlyBehaviour = defaultMallardDuck.getFlyBehaviour();
        QuackBehaviour defaultMallardDuckQuackBehaviour = defaultMallardDuck.getQuackBehaviour();
        defaultMallardDuck.display();
        defaultMallardDuck.performFly();
        defaultMallardDuck.performQuack();
        defaultMallardDuck.swim();

        // Custom Mallard Duck that initially can't fly or quack, but changes its behaviour at runtime
        Duck customMallardDuck = new MallardDuck("Bob", new FlyNoWay(), new MuteQuack());
        String customMallardDuckName = customMallardDuck.getName();
        FlyBehaviour customMallardDuckFlyBehaviour = customMallardDuck.getFlyBehaviour();
        QuackBehaviour customMallardDuckQuackBehaviour = customMallardDuck.getQuackBehaviour();
        customMallardDuck.display();
        customMallardDuck.performFly();
        customMallardDuck.setFlyBehaviour(new FlyRockedPowered());
        customMallardDuck.performFly();
        customMallardDuck.performQuack();
        customMallardDuck.setQuackBehaviour(new Squeak());
        customMallardDuck.performQuack();
        customMallardDuck.swim();
    }
}
