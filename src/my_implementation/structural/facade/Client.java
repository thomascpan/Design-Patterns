package my_implementation.structural.facade;

/**
 * Created by thomaspan on 4/25/17.
 */
public class Client {
    public static void main(String[] args) {
        IO facade = new IO();

        facade.write("hello");

        System.out.println(facade.read());
    }
}