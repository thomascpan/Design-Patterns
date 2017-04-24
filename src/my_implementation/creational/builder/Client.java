package my_implementation.creational.builder;

public class Client {
    public static void main(String[] args) {
        ProductBuilder builder = new CarProductBuilder();
        Director director = new Director(builder);

        Product product = director.construct(25000, "red");
        System.out.println(product);

        builder = new BikeProductBuilder();
        director.setBuilder(builder);

        product = director.construct(400, "black");
        System.out.println(product);
    }
}
