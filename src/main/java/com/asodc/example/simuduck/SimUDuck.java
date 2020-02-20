package com.asodc.example.simuduck;

public class SimUDuck {
    public static void main(String... args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.fly();
        mallardDuck.quack();
        mallardDuck.swim();

        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.fly();
        redheadDuck.quack();
        redheadDuck.swim();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.swim();

        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.swim();
    }
}
