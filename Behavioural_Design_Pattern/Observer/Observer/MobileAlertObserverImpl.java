
package Behavioural_Design_Pattern.Observer.Observer;

import Behavioural_Design_Pattern.Observer.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String email;
    StockObservable observable;

    public MobileAlertObserverImpl(String email, StockObservable sb){
        this.email = email;
        this.observable=sb;
    }

    @Override
    public void update(){
        System.out.println("Sending SMS to the user "+email);
    }

}
