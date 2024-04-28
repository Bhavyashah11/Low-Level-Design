package AbstractFactory;

public class LuxaryCarFactory implements AbstractFactory{

    @Override
    public Car getInstance(int price){
        if(price>50000 && price <100000)
        return new LuxaryCar1();
        else return new LuxaryCar2();
    }
}
