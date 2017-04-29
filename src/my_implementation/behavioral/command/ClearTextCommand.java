package my_implementation.behavioral.command;

/**
 * Created by thomaspan on 4/29/17.
 */
public class ClearTextCommand extends AbstractCommand {
    private String clearedText;

    public ClearTextCommand(TextEditor textEditor) {
        super(textEditor);
    }

    @Override
    public void execute() {
        this.clearedText = getTextEditor().getText();
        getTextEditor().setText(null);
    }

    @Override
    public void undo() {
        getTextEditor().setText(clearedText);
    }
}
