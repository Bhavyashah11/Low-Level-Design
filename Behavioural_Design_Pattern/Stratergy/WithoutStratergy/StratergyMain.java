package Behavioural_Design_Pattern.Stratergy.WithoutStratergy;

public class StratergyMain {
    public static void main(String[] args) {
        Stratergy offroad = new OffRoad();
        offroad.drive();
        Stratergy sports = new SportVehicle();
        sports.drive();
    }
}
