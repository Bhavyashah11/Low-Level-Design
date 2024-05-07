package Behavioural_Design_Pattern.Observer.Observer;

import Behavioural_Design_Pattern.Observer.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    String email;
    StockObservable observable;

    public EmailAlertObserverImpl(String email, StockObservable sb){
        this.email = email;
        this.observable=sb;
    }
    @Override
    public void update(){
        System.out.println("Sending Email to the user " + email);
    }

}
