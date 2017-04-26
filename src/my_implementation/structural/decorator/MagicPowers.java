package my_implementation.structural.decorator;

/**
 * Created by thomaspan on 4/25/17.
 */
public class MagicPowers extends CharacterTraits {

    public MagicPowers(Character character) {
        super(character);
    }

    @Override
    public void action() {
        super.action();
        System.out.println("Magic missle!");
    }
}
