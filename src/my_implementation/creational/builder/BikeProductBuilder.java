package my_implementation.creational.builder;

/**
 * Created by thomaspan on 4/24/17.
 */
public class BikeProductBuilder implements ProductBuilder {
    private Product product;

    public BikeProductBuilder() {
        this.product = new BikeProduct();
    }

    @Override
    public Product build() {
        return product;
    }

    @Override
    public BikeProductBuilder setValue(int value) {
        this.product.setValue(value);
        return this;
    }

    @Override
    public BikeProductBuilder setColor(String color) {
        this.product.setColor(color);
        return this;
    }
}
