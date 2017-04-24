package my_implementation.creational.builder;

/**
 * Created by thomaspan on 4/24/17.
 */
public interface ProductBuilder {

    public Product build();

    public ProductBuilder setValue(int value);

    public ProductBuilder setColor(String color);
}
