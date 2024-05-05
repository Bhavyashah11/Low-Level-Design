package FlyWeight;

public class HumanoidRobot implements IRobot{
    String type;
    String sprites;
    int x;
    int y;
    HumanoidRobot(String type, String sprites){
        this.type = type;
        this.sprites = sprites;
    }

    @Override
    public void display(int x , int y){
        System.out.println("Co-ordinates are " + x + " "+ y);
    }
}
