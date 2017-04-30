package my_implementation.behavioral.visitor;

/**
 * Created by thomaspan on 4/29/17.
 */
public class Client {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Yarn yarn = new Yarn();

        Dog dog = new Dog();
        Cat cat = new Cat();

        ball.accept(dog);
        ball.accept(cat);

        yarn.accept(dog);
        yarn.accept(cat);
    }
}
