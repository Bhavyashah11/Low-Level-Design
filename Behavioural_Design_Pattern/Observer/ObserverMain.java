package Behavioural_Design_Pattern.Observer;

import Behavioural_Design_Pattern.Observer.Observable.IphoneObservableImpl;
import Behavioural_Design_Pattern.Observer.Observable.StockObservable;
import Behavioural_Design_Pattern.Observer.Observer.EmailAlertObserverImpl;
import Behavioural_Design_Pattern.Observer.Observer.MobileAlertObserverImpl;
import Behavioural_Design_Pattern.Observer.Observer.NotificationAlertObserver;

public class ObserverMain {
    public static void main(String[] args) {

        StockObservable iphoneStock = new IphoneObservableImpl();
        NotificationAlertObserver ob1 = new EmailAlertObserverImpl("email@xyc.com",iphoneStock);
        NotificationAlertObserver ob2 = new EmailAlertObserverImpl("email@xyc.com",iphoneStock);
        NotificationAlertObserver ob3 = new MobileAlertObserverImpl("123456789",iphoneStock);

        iphoneStock.add(ob1);
        iphoneStock.add(ob2);
        iphoneStock.add(ob3);

        iphoneStock.setStockCount(10);
        iphoneStock.setStockCount(-10);
        iphoneStock.setStockCount(10);
    }
}
