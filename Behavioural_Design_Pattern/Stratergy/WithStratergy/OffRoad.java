package Behavioural_Design_Pattern.Stratergy.WithStratergy;

import Behavioural_Design_Pattern.Stratergy.WithStratergy.Stratergy.NormalDriveStratergy;

public class OffRoad extends Vehicle {
   
    public OffRoad(){
        super(new NormalDriveStratergy());
    }
}
