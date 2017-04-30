package my_implementation.behavioral.strategy;

/**
 * Created by thomaspan on 4/29/17.
 */
public class ComplexCalculation implements Strategy {
    @Override
    public void solve() {
        complexStep1().complexStep2().complexStep3();
    }

    private ComplexCalculation complexStep1() {
        System.out.println("Complex step 1.");
        return this;
    }

    private ComplexCalculation complexStep2() {
        System.out.println("Complex step 2.");
        return this;
    }

    private ComplexCalculation complexStep3() {
        System.out.println("Complex step 3.");
        return this;
    }
}
