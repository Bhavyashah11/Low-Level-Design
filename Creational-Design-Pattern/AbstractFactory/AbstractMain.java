package AbstractFactory;

public class AbstractMain {
    
    public static void main(String[] args){
    AbstractFactoryProducer abstractFactoryProducer = new AbstractFactoryProducer();
    AbstractFactory abstractFactory =  abstractFactoryProducer.getFactoryInstance("Premium");
    Car car =  abstractFactory.getInstance(90000);
    car.getTopSpeed();
    // System.out.println("test");
    }
}
