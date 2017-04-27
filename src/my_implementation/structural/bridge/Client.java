package my_implementation.structural.bridge;

/**
 * Created by thomaspan on 4/25/17.
 */
public class Client {
    public static void main(String[] args) {
        CharacterImpl male = new MaleCharacterImpl();
        CharacterImpl female = new FemaleCharacter();

        Character character = new Mage("Wizzy Wizard", 100, male);
        character.attack();

        character.setCharacter(female);
        character.attack();

        character = new Warrior("Mayham Max", 99, male);
        character.attack();

        character.setCharacter(female);
        character.attack();
    }
}
