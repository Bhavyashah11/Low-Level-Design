package Behavioural_Design_Pattern.Observer.Observable;

import Behavioural_Design_Pattern.Observer.Observer.NotificationAlertObserver;

public interface StockObservable {
    
    public void add(NotificationAlertObserver ob);
    public void remove(NotificationAlertObserver ob);
    public void notiyAllSubscribers();
    public void setStockCount(int newStocks);
    public int getStockCount();

}
