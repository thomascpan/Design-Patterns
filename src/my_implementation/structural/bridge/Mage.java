package my_implementation.structural.bridge;

/**
 * Created by thomaspan on 4/25/17.
 */
public class Mage extends Character {

    public Mage(String name, int level, CharacterImpl character) {
        super(name, level, character);
    }

    @Override
    public void attack() {
        character.attack();
        System.out.println("Zap zap!");
    }
}
