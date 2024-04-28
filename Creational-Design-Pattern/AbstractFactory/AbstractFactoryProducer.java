package AbstractFactory;

public class AbstractFactoryProducer {

    public AbstractFactory getFactoryInstance(String carType){
        if (carType.equals("Premium")) return new LuxaryCarFactory();
        else return new EconomicCarFactory();
    }
}
