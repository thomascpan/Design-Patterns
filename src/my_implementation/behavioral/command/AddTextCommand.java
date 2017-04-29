package my_implementation.behavioral.command;

/**
 * Created by thomaspan on 4/29/17.
 */
public class AddTextCommand extends AbstractCommand {
    private String undoText;
    private String textToBeAdded;

    public AddTextCommand(TextEditor textEditor, String text) {
        super(textEditor);
        this.textToBeAdded = text;
    }

    @Override
    public void execute() {
        undoText = getTextEditor().getText();
        getTextEditor().setText(textToBeAdded);
    }

    @Override
    public void undo() {
        getTextEditor().setText(undoText);
    }
}
