package Factory;

public class FactoryMain {

   public static void main(String[] args){
    Factory f = new Factory();
    Shape cirle = f.getShape("circle");
    Shape square = f.getShape("square");
    cirle.createShape();
    square.createShape();
   }
}
