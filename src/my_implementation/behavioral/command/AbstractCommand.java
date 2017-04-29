package my_implementation.behavioral.command;

/**
 * Created by thomaspan on 4/29/17.
 */
public abstract class AbstractCommand implements Command {
    private TextEditor textEditor;


    public AbstractCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public TextEditor getTextEditor() {
        return textEditor;
    }
}
