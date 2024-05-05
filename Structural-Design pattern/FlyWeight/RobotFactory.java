package FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    static Map<String , IRobot> cacheMap = new HashMap<>();

    public static IRobot createRobot(String robotType){
        if(cacheMap.containsKey(robotType)){
            System.out.println("Rturing o from cache");
            return cacheMap.get(robotType);
        }
        else{
            if (robotType =="humanoid") {
                IRobot human = new HumanoidRobot("humanoid", "Sprites");
                cacheMap.put("humanoid", human);
                return human;
            }
            else{
                IRobot caRobot = new CarRobot("CarRobot", "Sprites");
                cacheMap.put("carRobot", caRobot);
                return caRobot;
            }
        }
        }
}
