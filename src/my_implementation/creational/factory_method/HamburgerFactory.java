package my_implementation.creational.factory_method;

/**
 * Created by thomaspan on 4/24/17.
 */
public class HamburgerFactory implements FoodFactory {
    @Override
    public Food construct() {
        return new Hamburger();
    }
}
