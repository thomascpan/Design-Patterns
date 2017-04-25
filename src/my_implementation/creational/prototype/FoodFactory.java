package my_implementation.creational.prototype;

/**
 * Created by thomaspan on 4/24/17.
 */
public class FoodFactory {
    Hamburger hamburger = new Hamburger(0);
    Fries fries = new Fries(0);

    public Food construct(String food, int tastiness) {
        if (food == "Hamburger") {
            return hamburger.clone(tastiness);
        } else {
            return fries.clone(tastiness);
        }
    }
}
