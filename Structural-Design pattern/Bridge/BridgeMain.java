package Bridge;

class BridgeMain{
    public static void main(String[] args) {
        LivingThings fish = new Fish(new WaterBreathe());
        fish.breathe();
    }
}