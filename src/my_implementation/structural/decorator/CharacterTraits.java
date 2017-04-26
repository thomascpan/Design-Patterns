package my_implementation.structural.decorator;

/**
 * Created by thomaspan on 4/25/17.
 */
public abstract class CharacterTraits implements Character {
    private Character character;

    public CharacterTraits(Character character) {
        this.character = character;
    }

    @Override
    public void action() {
        character.action();
    }
}
