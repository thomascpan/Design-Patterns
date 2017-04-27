package my_implementation.structural.proxy;

/**
 * Created by thomaspan on 4/26/17.
 */
public class Client {
    public static void main(String[] args) {
        AdvancedRobotProxy robot = new AdvancedRobotProxy();

        System.out.println(robot.getRobot());

        robot.speak();

        System.out.println(robot.getRobot());
    }
}
