package my_implementation.creational.prototype;

/**
 * Created by thomaspan on 4/24/17.
 */
public class Client {
    public static void main(String[] args) {
        FoodFactory factory = new FoodFactory();

        Food food = factory.construct("Hamburger", 10);

        System.out.println(food);

        food = factory.construct("Hamburger", 5);

        System.out.println(food);

        food = factory.construct("Fries", 8);

        System.out.println(food);
    }
}
