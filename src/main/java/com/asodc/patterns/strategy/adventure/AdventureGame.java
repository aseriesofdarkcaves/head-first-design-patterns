package com.asodc.patterns.strategy.adventure;

import java.util.ArrayList;
import java.util.List;

public class AdventureGame {
    public static void main(String... args) {
        List<Character> characters = new ArrayList<>();

        // init characters with default weapons (fists)
        Character king = new King("Henry");
        Character knight = new Knight("Lancealot");
        Character queen = new Queen("Maeve");
        Character troll = new Troll("Chungus");

        // add characters to a collection so we can loop through them later
        characters.add(king);
        characters.add(knight);
        characters.add(queen);
        characters.add(troll);

        startFighting(characters);

        // give characters new weapons
        king.setWeapon(new AxeBehaviour());
        knight.setWeapon(new BowAndArrowBehaviour());
        queen.setWeapon(new KnifeBehaviour());
        troll.setWeapon(new SwordBehaviour());

        startFighting(characters);
    }

    private static void startFighting(List<Character> characters) {
        for (Character character : characters) {
            character.fight();
        }
    }
}
