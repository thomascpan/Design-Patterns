package my_implementation.creational.builder;

/**
 * Created by thomaspan on 4/24/17.
 */
public class CarProductBuilder implements ProductBuilder {
    private Product product;

    public CarProductBuilder() {
        this.product = new CarProduct();
    }

    @Override
    public Product build() {
        return product;
    }

    @Override
    public CarProductBuilder setValue(int value) {
        this.product.setValue(value);
        return this;
    }

    @Override
    public CarProductBuilder setColor(String color) {
        this.product.setColor(color);
        return this;
    }
}
