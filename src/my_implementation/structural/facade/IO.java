package my_implementation.structural.facade;

/**
 * Created by thomaspan on 4/25/17.
 */
public class IO {
    private ReadSystem reader;
    private WriteSystem writer;
    private String text;

    public IO() {
        reader = new ReadSystem();
        writer = new WriteSystem();
    }

    public String read() {
        return reader.read(text);
    }

    public void write(String input) {
        text = writer.write(input);
    }
}
