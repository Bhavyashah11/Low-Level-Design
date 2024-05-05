package FlyWeight;
public class FlyWeightMain {
    public static void main(String[] args) {
        IRobot humanRobot = RobotFactory.createRobot("humanoid");
        humanRobot.display(0, 0);
        IRobot humanRobot2 = RobotFactory.createRobot("humanoid");
        humanRobot2.display(4, 8);
        IRobot carRobot = RobotFactory.createRobot("carRobot");
        carRobot.display(2, 3);

     
    }
}
