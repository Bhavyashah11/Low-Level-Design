package Factory;

public class Circle implements Shape {
    
    @Override
    public void createShape(){
        System.out.println("creating circle shape");
    }
}
