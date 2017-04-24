package my_implementation.creational.abstract_factory;

public class Client {
    public static void main(String[] args) {
        MealFactory factory = new HealthyMealFactory();

        printMeal(factory);

        factory = new DeliciousMealFactory();

        printMeal(factory);
    }

    static void printMeal(MealFactory factory) {
        System.out.println(factory.createEntree().getClass() + " and " + factory.createSide().getClass());
    }
}
