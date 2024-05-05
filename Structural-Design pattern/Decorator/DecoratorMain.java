package Decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        BasePizza pizza = new Cheese(new Mushroom(new Margritta()));
        System.out.println(pizza.getPrice());
    }
}
