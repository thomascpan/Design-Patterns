package my_implementation.behavioral.visitor;

/**
 * Created by thomaspan on 4/29/17.
 */
public class Dog implements Pet {
    @Override
    public void visit(Ball ball) {
        System.out.println("Bark Bark! (Let's play fetch).");
    }

    @Override
    public void visit(Yarn yarn) {
        System.out.println("Bark Bark! (What the freak is this?)");
    }
}
