package my_implementation.behavioral.strategy;

/**
 * Created by thomaspan on 4/29/17.
 */
public class Client {
    public static void main(String[] args) {
        Strategy simple = new SimpleCalculation();
        Strategy complex = new ComplexCalculation();

        simple.solve();
        complex.solve();
    }
}
