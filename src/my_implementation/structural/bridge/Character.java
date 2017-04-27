package my_implementation.structural.bridge;

/**
 * Created by thomaspan on 4/25/17.
 */
public abstract class Character {
    private String name;
    private int level;
    protected CharacterImpl character;

    public Character(String name, int level, CharacterImpl character) {
        this.name = name;
        this.level = level;
        this.character = character;
    }

    public abstract void attack();

    public void setCharacter(CharacterImpl character) {
        this.character = character;
    }
}
