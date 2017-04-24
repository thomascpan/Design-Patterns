package my_implementation.creational.abstract_factory;

/**
 * Created by thomaspan on 4/24/17.
 */
public class DeliciousMealFactory implements MealFactory {
    @Override
    public Entree createEntree() {
        return new Hamburger();
    }

    @Override
    public Side createSide() {
        return new Fries();
    }
}
