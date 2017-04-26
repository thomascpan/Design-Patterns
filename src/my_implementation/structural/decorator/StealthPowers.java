package my_implementation.structural.decorator;

/**
 * Created by thomaspan on 4/25/17.
 */
public class StealthPowers extends CharacterTraits {

    public StealthPowers(Character character) {
        super(character);
    }

    @Override
    public void action() {
        super.action();
        System.out.println("Sneak sneak!");
    }
}
