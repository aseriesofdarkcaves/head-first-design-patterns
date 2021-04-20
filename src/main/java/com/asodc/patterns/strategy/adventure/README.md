# Page 25 Design Puzzle exercise: Adventure Game
- Each character can make use of one weapon at a time
- Characters can change weapons at any time

# Tasks
1. Arrange the classes
2. Identify one abstract class, one interface and eight classes
3. Draw arrows between classes
4. Put the method setWeapon() into the right class

# Notes
I made two design changes from what the book suggested:
1. Character.fight() is a concrete method that all subtypes can use. This reduces the amount of code that was required in the subclasses (which was mostly the same anyway)
2. WeaponBehaviour.useWeapon() returns a String so it can be used in the Character.fight() method
