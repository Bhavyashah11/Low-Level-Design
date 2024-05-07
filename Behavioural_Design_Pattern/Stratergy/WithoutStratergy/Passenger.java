package Behavioural_Design_Pattern.Stratergy.WithoutStratergy;

public class Passenger implements Stratergy {
    
    @Override
    public void drive(){
        System.out.println("Passenger Driving");
    }

}
