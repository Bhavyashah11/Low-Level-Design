package Adapter;

public class AdapterMain {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachine(100.0));
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
