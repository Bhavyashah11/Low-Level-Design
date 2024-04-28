package AbstractFactory;

public class EconomicCar1  implements Car{

    @Override
    public void getTopSpeed(){
        System.out.println("Max speed is 100");
    }
}
