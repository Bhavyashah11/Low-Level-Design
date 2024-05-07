package Behavioural_Design_Pattern.Stratergy.WithStratergy;

import Behavioural_Design_Pattern.Stratergy.WithStratergy.Stratergy.DriveStratergy;

public class Vehicle {
    
    DriveStratergy driveStratergy;

    public Vehicle(DriveStratergy driveStratergy ){this.driveStratergy = driveStratergy;}
    public Vehicle(){}
    public void drive(){
        driveStratergy.drive();
    }
}
