package my_implementation.creational.factory_method;

public class Client {
    public static void main(String[] args) {
        FoodFactory factory = new HamburgerFactory();
        Food food = factory.construct();

        System.out.println(food);
        factory = new ShakeFactory();

        food = factory.construct();
        System.out.println(food);

    }
}
