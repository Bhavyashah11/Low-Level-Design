package Bridge;

public abstract class LivingThings {
        BreateImplementor breatheImpl;

        LivingThings(BreateImplementor breatheImpl){
            this.breatheImpl = breatheImpl;
        }

        abstract public void breathe();

}
