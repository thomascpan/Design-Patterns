package my_implementation.behavioral.visitor;

/**
 * Created by thomaspan on 4/29/17.
 */
public interface Pet {
    void visit(Ball ball);
    void visit(Yarn yarn);
}
