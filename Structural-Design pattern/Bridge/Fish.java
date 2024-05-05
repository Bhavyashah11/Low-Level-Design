package Bridge;

public class Fish extends LivingThings {
    BreateImplementor bi;
    Fish(BreateImplementor bi){
        super(bi);
    }

    @Override
    public void breathe(){
        bi.breathe();
    }
}
