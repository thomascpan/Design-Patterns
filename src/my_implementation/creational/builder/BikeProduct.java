package my_implementation.creational.builder;

/**
 * Created by thomaspan on 4/24/17.
 */
public class BikeProduct implements Product {
    private int value;
    private String color;

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "This is a $" + getValue() + " " + getColor() + " bike!";
    }
}
