package Adapter;

public class WeightMachineAdapterImpl  implements WeightMachineAdapter{
    WeightMachine weightmachine;
    WeightMachineAdapterImpl(WeightMachine weightMachine){this.weightmachine=weightMachine;}
    @Override
    public double getWeightInKg(){
        double weightInPound = weightmachine.getWeight();
        return weightInPound*.45;
    }
}
