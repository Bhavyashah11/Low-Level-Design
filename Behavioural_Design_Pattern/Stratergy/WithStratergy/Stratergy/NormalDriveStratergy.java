package Behavioural_Design_Pattern.Stratergy.WithStratergy.Stratergy;

public class NormalDriveStratergy implements DriveStratergy {
    
    @Override
    public void drive(){
        System.out.println("This is a normal mode drive");
    }
}
