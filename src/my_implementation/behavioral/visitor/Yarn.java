package my_implementation.behavioral.visitor;

/**
 * Created by thomaspan on 4/29/17.
 */
public class Yarn implements Toy {
    @Override
    public void accept(Pet p) {
        p.visit(this);
    }
}
