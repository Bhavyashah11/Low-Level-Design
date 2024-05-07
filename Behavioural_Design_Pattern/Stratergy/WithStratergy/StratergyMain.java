package Behavioural_Design_Pattern.Stratergy.WithStratergy;


public class StratergyMain {
    public static void main(String[] args) {
        Vehicle goodVehicle = new GoodsVehicle();
        goodVehicle.drive();
        Vehicle offRoad = new OffRoad();
        offRoad.drive();
    }
}
