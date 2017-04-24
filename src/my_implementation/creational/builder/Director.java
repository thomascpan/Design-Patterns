package my_implementation.creational.builder;

/**
 * Created by thomaspan on 4/24/17.
 */
public class Director {
    private ProductBuilder builder;

    public Director(ProductBuilder builder) {
        this.builder = builder;
    }

    public Product construct(int value, String color) {
        return builder.setValue(value).setColor(color).build();
    }

    public ProductBuilder getBuilder() {
        return builder;
    }

    public void setBuilder(ProductBuilder builder) {
        this.builder = builder;
    }
}
