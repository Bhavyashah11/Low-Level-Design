package Behavioural_Design_Pattern.Template;

public class TemplateMain {
    public static void main(String[] args){
        PaymentFlow p = new PaymentFlowImpl();
        p.sendMoney();
    }
}
