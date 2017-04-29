package my_implementation.behavioral.command;

import java.util.Stack;

/**
 * Created by thomaspan on 4/29/17.
 */
public class TextEditorApplication {
    private Stack<Command> commands;

    public TextEditorApplication() {
        this.commands = new Stack<>();
    }

    public void execute(Command cmd) {
        this.commands.push(cmd);
        cmd.execute();
    }

    public void undo() {
        Command cmd = commands.pop();
        if (cmd != null) {
            cmd.undo();
        }
    }
}
