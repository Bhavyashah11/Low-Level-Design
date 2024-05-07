package Behavioural_Design_Pattern.Template;

public abstract class PaymentFlow {
    public abstract void validateRequest();
    public abstract void calculateFees();
    public abstract void DebitAmmout();
    public abstract void CreditAmmont();

    public final void sendMoney(){
        validateRequest();
        calculateFees();
        DebitAmmout();
        CreditAmmont();
    }
}
