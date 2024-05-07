package Behavioural_Design_Pattern.Template;

public class PaymentFlowImpl extends PaymentFlow {
    
    public  void validateRequest(){System.out.println("Request Validated");}
    public  void calculateFees(){System.out.println("Calculating fees");}
    public  void DebitAmmout(){System.out.println("DEbitting Amount");}
    public  void CreditAmmont(){System.out.println("Credited Money");}

    
}
