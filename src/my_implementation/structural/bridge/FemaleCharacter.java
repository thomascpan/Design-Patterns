package my_implementation.structural.bridge;

/**
 * Created by thomaspan on 4/25/17.
 */
public class FemaleCharacter implements CharacterImpl {
    @Override
    public void attack() {
        System.out.println("Lady-like attack!");
    }
}
