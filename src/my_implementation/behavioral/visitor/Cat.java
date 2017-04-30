package my_implementation.behavioral.visitor;

/**
 * Created by thomaspan on 4/29/17.
 */
public class Cat implements Pet {
    @Override
    public void visit(Ball ball) {
        System.out.println("Meow! (Better get me something better!)");
    }

    @Override
    public void visit(Yarn yarn) {
        System.out.println("Meow! (Hmm! Okay, I'll play with this.)");
    }
}
