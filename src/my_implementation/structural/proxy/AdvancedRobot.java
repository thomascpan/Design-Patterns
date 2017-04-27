package my_implementation.structural.proxy;

/**
 * Created by thomaspan on 4/26/17.
 */
public class AdvancedRobot implements Robot {

    public AdvancedRobot() {
        expensiveProcess();
    }

    @Override
    public void speak() {
        System.out.println("I speak well!");
    }

    @Override
    public void fire() {
        System.out.println("Pow pow!");
    }

    private void expensiveProcess() {
        System.out.println("This is really expensive!");
    }
}
