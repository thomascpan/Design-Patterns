package my_implementation.creational.abstract_factory;

/**
 * Created by thomaspan on 4/24/17.
 */
public class HealthyMealFactory implements MealFactory {
    @Override
    public Entree createEntree() {
        return new Salad();
    }

    @Override
    public Side createSide() {
        return new Fruit();
    }
}
