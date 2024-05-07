package Behavioural_Design_Pattern.Observer.Observable;

import java.util.*;

import Behavioural_Design_Pattern.Observer.Observer.NotificationAlertObserver;


public class IphoneObservableImpl  implements StockObservable{
    public List<NotificationAlertObserver> observerListData = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver ob){
        observerListData.add(ob);
    }
    @Override
    public void remove(NotificationAlertObserver ob){
        observerListData.remove(ob);
    }

    public void notiyAllSubscribers(){
        for(NotificationAlertObserver observer : observerListData){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStocks){
        if(stockCount==0){
            notiyAllSubscribers();
        }
        stockCount = stockCount + newStocks;
    }

    @Override
    public int getStockCount(){return stockCount;}


}
