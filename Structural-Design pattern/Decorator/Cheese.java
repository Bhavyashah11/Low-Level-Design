package Decorator;

public class Cheese extends ToppingDecorator {
    BasePizza basePizza;
    
    public Cheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int getPrice(){
        return basePizza.getPrice()+20;
    }
}
