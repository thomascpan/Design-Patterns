package my_implementation.structural.bridge;

/**
 * Created by thomaspan on 4/25/17.
 */
public class MaleCharacterImpl implements CharacterImpl {
    @Override
    public void attack() {
        System.out.println("Manly attack!");
    }
}
