package my_implementation.creational.factory_method;

/**
 * Created by thomaspan on 4/24/17.
 */
public class Hamburger extends Food {
    private int cost = 5;
    private int tastiness = 8;

    @Override
    public String toString() {
        return "I'm a hamburger!";
    }
}
