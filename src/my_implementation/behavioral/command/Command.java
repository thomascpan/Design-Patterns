package my_implementation.behavioral.command;

/**
 * Created by thomaspan on 4/29/17.
 */
public interface Command {
    void execute();

    void undo();
}
