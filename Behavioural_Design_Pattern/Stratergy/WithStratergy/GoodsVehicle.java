package Behavioural_Design_Pattern.Stratergy.WithStratergy;

import Behavioural_Design_Pattern.Stratergy.WithStratergy.Stratergy.NormalDriveStratergy;

public class GoodsVehicle extends Vehicle {
   
    public GoodsVehicle(){
        super(new NormalDriveStratergy());
    }

}
