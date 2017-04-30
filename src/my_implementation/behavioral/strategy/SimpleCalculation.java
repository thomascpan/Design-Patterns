package my_implementation.behavioral.strategy;

/**
 * Created by thomaspan on 4/29/17.
 */
public class SimpleCalculation implements Strategy {
    @Override
    public void solve() {
        simpleStep1().simpleStep2().simpleStep3();
    }

    private SimpleCalculation simpleStep1() {
        System.out.println("Simple step 1.");
        return this;
    }

    private SimpleCalculation simpleStep2() {
        System.out.println("Simple step 2.");
        return this;
    }

    private SimpleCalculation simpleStep3() {
        System.out.println("Simple step 3.");
        return this;
    }
}
