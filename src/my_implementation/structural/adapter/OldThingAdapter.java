package my_implementation.structural.adapter;

/**
 * Created by thomaspan on 4/25/17.
 */
public class OldThingAdapter implements Thing {
    private OldThing adaptee = new OldThing();

    @Override
    public String getText() {
        return adaptee.getText();
    }

    @Override
    public void setText(String text) {
        text = "New " + text;
        adaptee.setText(text);
    }
}
