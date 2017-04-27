package my_implementation.structural.proxy;

/**
 * Created by thomaspan on 4/26/17.
 */
public class AdvancedRobotProxy implements Robot {
    AdvancedRobot robot;


    @Override
    public void speak() {
        if (robot == null) {
            robot = new AdvancedRobot();
        }
        robot.speak();
    }

    @Override
    public void fire() {
        if (robot == null) {
            robot = new AdvancedRobot();
        }
        robot.fire();
    }

    public AdvancedRobot getRobot() {
        return robot;
    }
}
