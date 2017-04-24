package my_implementation.creational.singleton;

/**
 * Created by thomaspan on 4/24/17.
 */
public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("hello");

        System.out.println(singleton.getValue());

        singleton = Singleton.getInstance("bye");

        System.out.println(singleton.getValue());
    }
}
