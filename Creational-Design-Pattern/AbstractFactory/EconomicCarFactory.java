package AbstractFactory;

public class EconomicCarFactory implements AbstractFactory{

    @Override
    public Car getInstance(int price){
        if(price>10000 && price <100000)
        return new EconomicCar1();
        else return new EconomicCar2();
    }
}

