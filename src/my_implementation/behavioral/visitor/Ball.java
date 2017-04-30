package my_implementation.behavioral.visitor;

/**
 * Created by thomaspan on 4/29/17.
 */
public class Ball implements Toy {
    @Override
    public void accept(Pet p) {
        p.visit(this);
    }
}
