package my_implementation.behavioral.command;

/**
 * Created by thomaspan on 4/29/17.
 */
public class Client {
    public static void main(String[] args) {
        TextEditorApplication application = new TextEditorApplication();
        TextEditor textEditor = new TextEditor();

        application.execute(new AddTextCommand(textEditor, "123"));
        System.out.println(textEditor.getText());

        application.undo();
        System.out.println(textEditor.getText());

        application.execute(new AddTextCommand(textEditor, "456"));
        System.out.println(textEditor.getText());

        application.execute(new ClearTextCommand(textEditor));
        System.out.println(textEditor.getText());

        application.undo();
        System.out.println(textEditor.getText());
    }
}
