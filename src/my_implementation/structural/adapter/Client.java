package my_implementation.structural.adapter;

/**
 * Created by thomaspan on 4/25/17.
 */
public class Client {
    public static void main(String[] args) {
        OldThingAdapter newThing = new OldThingAdapter();

        newThing.setText("hello");

        System.out.println(newThing.getText());
    }
}
