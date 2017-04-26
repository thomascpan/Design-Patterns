package my_implementation.structural.decorator;

/**
 * Created by thomaspan on 4/25/17.
 */
public class FightingPowers extends CharacterTraits {

    public FightingPowers(Character character) {
        super(character);
    }

    @Override
    public void action() {
        super.action();
        System.out.println("Slash slash!");
    }
}
