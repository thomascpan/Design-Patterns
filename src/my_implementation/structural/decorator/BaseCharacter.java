package my_implementation.structural.decorator;

/**
 * Created by thomaspan on 4/25/17.
 */
public class BaseCharacter implements Character {
    private String name;

    public BaseCharacter(String name) {
        this.name = name;
    }

    @Override
    public void action() {
        System.out.println(name + " is ready!");
    }
}
