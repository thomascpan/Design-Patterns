package my_implementation.creational.factory_method;

/**
 * Created by thomaspan on 4/24/17.
 */
public class ShakeFactory implements FoodFactory {

    @Override
    public Food construct() {
        return new Shake();
    }
}
